package repository.address.Impl;



import domain.users.Address;
import factory.domain.address.AddressFactory;
import repository.address.AddressInt;

import java.sql.*;
import java.util.ArrayList;

public class AddressRep implements AddressInt {
    private String url = "jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "";
    private Connection conne;
    private static AddressRep addressRep;

    private AddressRep() {
        try {
            this.conne = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static AddressRep getAddressRep(){
        if(addressRep==null){
            addressRep=new AddressRep();
        }return addressRep;
    }

    @Override
    public Address create(Address address) {
        int driverNumber = getItemNumber();
        String getDriverNumber = "" + driverNumber + "".trim();
        try {
            String sql = "INSERT INTO ADDRESS (EMAIL , ADDRESS ,PHONE_NUMBER )" +
                    " VALUES ('" + address.getEmailAddress() + "','" + address.getAddress() + "','" + address.getPhoner_Number() + "');";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row inserted in Item table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(getDriverNumber);
    }

    @Override
    public Address update(Address address) {
        String custNumber = address.getEmailAddress();
        System.out.println(custNumber);
        try {
            String sql = "update ADDRESS set ADDRESS='"+address.getAddress() +"',PHONE_NUMBER='" + address.getPhoner_Number() + "',WHERE EMAIL='" + custNumber + "';";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row updated in Driver table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(custNumber);
    }

    @Override
    public void delete(String s) {
        int s2 = Integer.parseInt(s);
        //before deleting we read first
        System.out.println(read(s).toString() + "\n this driver is deleted");
        try {
            String sql = "DELETE from ADDRESS WHERE EMAIL=" + s2 + ";";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Address read(String id) {
        Address address=null;
        try {
            String sql = "select * from ADDRESS WHERE EMAIL=" + id + ";";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                address= AddressFactory.getAddress(rs.getString(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public ArrayList<String> readAll() {
        Address address=null;
        ArrayList<String> myList2 = new ArrayList<>();
        try {
            String sql = "select * from driver ;";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                address= AddressFactory.getAddress(rs.getString(1),rs.getString(2),rs.getString(3));
                myList2.add(address.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException x) {
        }
        return myList2;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
