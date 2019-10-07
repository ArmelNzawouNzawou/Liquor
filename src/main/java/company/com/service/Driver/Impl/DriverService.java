package company.com.service.Driver.Impl;


import company.com.domain.driver.Driver;
import company.com.factory.repository.DriverRepFact;
import company.com.repository.drivers.DriverRepInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import company.com.repository.drivers.impl.DriverRep;
import company.com.service.Driver.DriverServiceInt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DriverService implements DriverServiceInt {


    DriverRep driver= DriverRepFact.getDriverRep();
    @Autowired
    DriverRepInt driverRepInt;

    private static DriverService driverService=null;

    private DriverService() {

    }

    public static DriverService getDriverService() {
        if(driverService==null)
        {
            driverService=new DriverService();
        }return driverService;
    }

    @Override
    public Driver create(Driver driverProduct) {
        return driverRepInt.save(driverProduct); // this creates and read what you have created from the database.
    }

    @Override
    public Driver update(Driver driverProduct) {
        Optional<Driver> myDriver=driverRepInt.findById(driverProduct.getId());
        if(myDriver!=null){
            delete(driverProduct.getId());
            driverRepInt.save(driverProduct);
            return myDriver.orElse(null);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        driverRepInt.deleteById(id);
    }
    @Override
    public Driver read(String id) {
        Optional<Driver>result=driverRepInt.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Driver> readAlll() {
        return driverRepInt.findAll();
    }
}
