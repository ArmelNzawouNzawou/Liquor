package company.com.repository.drivers.impl;
import company.com.domain.driver.Driver;
import company.com.repository.drivers.DriverRepInt;

import java.util.ArrayList;

public class DriverRep implements DriverRepInt {

    private static DriverRep driverRep = null;
    private ArrayList<Driver> mydb=new ArrayList<>();

    private DriverRep() {

    }

    public static DriverRep getInstance() {
        if (driverRep == null) {
            return new DriverRep();
        } else return null;
    }


    @Override
    public Driver create(Driver driver) {
        Driver result=findDriver(driver.getId());
        if(result==null){
            mydb.add(driver);
            return driver;
        }
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        Driver result=findDriver(driver.getId());
        if(result!=null){
            delete(result.getId());

            return create(driver);
        }else
        return null;
    }

    @Override
    public void delete(String s) {
        Driver result=findDriver(s);
        if(result!=null){ mydb.remove(result);}
    }

    @Override
    public Driver read(String s) {
        return null;
    }

    @Override
    public ArrayList<Driver> readAll() {
       return mydb;
    }

    public Driver findDriver(String id){
        return mydb.stream()
                .filter(D -> D.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
