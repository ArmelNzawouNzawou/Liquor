package company.com.repository.user.impl;


import company.com.domain.users.User;
import company.com.repository.user.UserInt;

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
        User result=findUser(user.getEmail());
        if(result==null){
            mydb.add(user);
            return user;
        }return null;
    }

    @Override
    public User update(User user) {
        User result=findUser(user.getEmail());
        if(result!=null){
           delete(result.getEmail());
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


    public User findUser(String id){
        return mydb.stream()
                .filter(C ->C.getEmail().equals(id))
                .findAny()
                .orElse(null);
    }
}
