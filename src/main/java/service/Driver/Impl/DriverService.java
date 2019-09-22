package service.Driver.Impl;


import domain.driver.Driver;
import factory.repository.DriverRepFact;
import org.springframework.stereotype.Component;
import repository.drivers.impl.DriverRep;
import service.Driver.DriverServiceInt;

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
