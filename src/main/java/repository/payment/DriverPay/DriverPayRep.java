package repository.payment.DriverPay;

import domain.driverPay.D_pay;
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

    private ArrayList<DriverPay>mydb=new ArrayList<>();


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
        DriverPay result=findDriverPay(driverPay.getPayCode());
        if(result==null){
            mydb.add(driverPay);
            return driverPay;
        }
        return null;
    }

    @Override
    public DriverPay update(DriverPay driverPay) {
        DriverPay result=findDriverPay(driverPay.getPayCode());
        if(result!=null){
            delete(driverPay.getPayCode());
            return driverPay;
        }
        return null;
    }

    @Override
    public void delete(String s) {

        DriverPay result=findDriverPay(s);
        if(result!=null){
            mydb.remove(result);
        }
    }

    @Override
    public DriverPay read(String s) {
        DriverPay result=findDriverPay(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<DriverPay> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public DriverPay findDriverPay(String id){
        return mydb.stream()
                .filter(C ->C.getPayCode().equals(id))
                .findAny()
                .orElse(null);
    }
}
