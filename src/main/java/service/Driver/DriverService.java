package service.Driver;


import domain.driver.Driver;
import factory.repository.DriverRepFact;
import repository.drivers.impl.DriverRep;

import java.util.ArrayList;

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
    public ArrayList<String> readAlll() {
        return driver.readAll();
    }
}
