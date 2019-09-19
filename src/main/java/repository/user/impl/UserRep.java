package repository.user.impl;

import com.domain.users.User;
import com.factory.domain.user.UserFactory;
import com.repository.user.UserInt;

import java.sql.*;
import java.util.ArrayList;

public class UserRep implements UserInt {
    private static UserRep userRep=null;

    private String url = "jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "";
    private Connection conne;

    private UserRep() {
        try {
            this.conne = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static UserRep getUserRep(){
        if(userRep==null){
            userRep=new UserRep();
        }return userRep;
    }
    @Override
    public User create(User user) {
        int driverNumber = getItemNumber();
        String getDriverNumber = "" + driverNumber + "".trim();
        try {
            String sql = "INSERT INTO USERS(USER_ID , NAME ,SURNAME )" +
                    " VALUES ('" + driverNumber + "','" + user.getName() + "','" + user.getSurName() + "');";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row inserted in Item table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(getDriverNumber);
    }

    @Override
    public User update(User user) {
        String custNumber = user.getId();
        //System.out.println(custNumber);
        try {
            String sql = "update USERS set NAME='"+user.getName() +"',SURNAME='" + user.getSurName() + "',WHERE USER_ID='" + custNumber + "';";
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
            String sql = "DELETE from USERS WHERE USER_ID=" + s2 + ";";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User read(String s) {
        User user=null;
        try {
            String sql = "select * from ADDRESS WHERE USER_ID=" + s + ";";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                user= UserFactory.getUser(rs.getString(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        User user=null;
        ArrayList<String> myList2 = new ArrayList<>();
        try {
            String sql = "select * from ADDRESS ;";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                user= UserFactory.getUser(rs.getString(1),rs.getString(2),rs.getString(3));
                myList2.add(user.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException x) {
        }
        return myList2;
    }

    @Override
    public int getItemNumber() {
        int highValeu=0;
        try {
            String sql="select MAX(USER_ID) from ADDRESS ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                highValeu=Integer.parseInt(rs.getString(1));
            } }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e )
        {
            highValeu=1000;
        }catch (NumberFormatException x){ highValeu=1000;}


        return highValeu;
    }
}
