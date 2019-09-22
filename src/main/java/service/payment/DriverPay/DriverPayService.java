package service.payment.DriverPay;

import domain.driverPay.DriverPay;
import factory.repository.DriverPayRepFactory;
import repository.payment.DriverPay.DriverPayRep;
import service.payment.DriverPayInt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DriverPayService implements DriverPayInt {

    private static DriverPayService driverPayRep=null;
    private DriverPayRep driverPayR= DriverPayRepFactory.getDriverPayRep();

    private DriverPayService() {

    }

    public static DriverPayService getDriverPayRep() {

        if (driverPayRep==null)
        {
             driverPayRep=new DriverPayService();
        }return driverPayRep;
    }


    @Override
    public DriverPay create(DriverPay driverPay) {
        return driverPayR.create(driverPay);
    }

    @Override
    public DriverPay update(DriverPay driverPay) {
        return driverPayR.update(driverPay);
    }

    @Override
    public void delete(String id) {
        driverPayR.delete(id);
    }

    @Override
    public DriverPay read(String id) {
        return driverPayR.read(id);
    }

    @Override
    public ArrayList<DriverPay> readAlll() {
        return driverPayR.readAll();
    }
}
