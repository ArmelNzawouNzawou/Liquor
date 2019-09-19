package repository.payment.DriverPay;

import domain.driverPay.DriverPay;
import repository.payment.DriverPayInt;

import java.sql.*;
import java.util.ArrayList;

public class DriverPayRep implements DriverPayInt {
    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;
    private static DriverPayRep driverPayRep=null;


    private DriverPayRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DriverPayRep getDriverPayRep() {

        if (driverPayRep==null)
        {
             driverPayRep=new DriverPayRep();
        }return driverPayRep;
    }


    @Override
    public DriverPay create(DriverPay driverPay) {
        return null;
    }

    @Override
    public DriverPay update(DriverPay driverPay) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public DriverPay read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
