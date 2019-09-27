package company.com.service.Driver.Impl;


import company.com.domain.driver.Driver;
import company.com.factory.repository.DriverRepFact;
import org.springframework.stereotype.Component;
import company.com.repository.drivers.impl.DriverRep;
import company.com.service.Driver.DriverServiceInt;

import java.util.ArrayList;
@Component
public class DriverService implements DriverServiceInt {


    DriverRep driver= DriverRepFact.getDriverRep();

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
        return driver.create(driverProduct); // this creates and read what you have created from the database.
    }

    @Override
    public Driver update(Driver driverProduct) {
        return driver.update(driverProduct);
    }

    @Override
    public void delete(String id) {
        driver.delete(id);
    }
    @Override
    public Driver read(String id) {
        return driver.read(id);
    }

    @Override
    public ArrayList<Driver> readAlll() {
        return driver.readAll();
    }
}
