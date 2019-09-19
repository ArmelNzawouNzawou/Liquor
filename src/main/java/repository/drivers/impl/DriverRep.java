package repository.drivers.impl;
import domain.driver.Driver;
import repository.drivers.DriverRepInt;

import java.sql.*;
import java.util.ArrayList;

public class DriverRep implements DriverRepInt {

    private static DriverRep driverRep = null;
    private int value;
    //database setting up
    private String url = "jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "";
    private Connection conne;

    private DriverRep() {
        try {
            this.conne = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DriverRep getInstance() {
        if (driverRep == null) {
            return new DriverRep();
        } else return null;
    }


    @Override
    public Driver create(Driver driver) {
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Driver read(String s) {
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
