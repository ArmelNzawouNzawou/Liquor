package repository.user.impl;


import domain.driverPay.DriverPay;
import domain.users.User;
import factory.domain.user.UserFactory;
import repository.user.UserInt;

import java.sql.*;
import java.util.ArrayList;

public class UserRep implements UserInt {
    private static UserRep userRep=null;
    private ArrayList<User>mydb=new ArrayList<>();


    private UserRep() {

    }

    public static UserRep getUserRep(){
        if(userRep==null){
            userRep=new UserRep();
        }return userRep;
    }
    @Override
    public User create(User user) {
        User result=findUser(user.getId());
        if(result==null){
            mydb.add(user);
            return user;
        }return null;
    }

    @Override
    public User update(User user) {
        User result=findUser(user.getId());
        if(result!=null){
           delete(result.getId());
            return create(user);
        }return null;
    }

    @Override
    public void delete(String s) {
        User result=findUser(s);
        if(result!=null){
            mydb.remove(result);
        }
    }

    @Override
    public User read(String s) {
        User result=findUser(s);
        if(result!=null){
            return result;
        }return null;
    }

    @Override
    public ArrayList<User> readAll() {
       return mydb;
    }

    @Override
    public int getItemNumber() {

        return 0;
    }
    public User findUser(String id){
        return mydb.stream()
                .filter(C ->C.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
