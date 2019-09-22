package service.user.impl;

import domain.users.User;
import service.user.UserServiceInt;

import java.util.ArrayList;

public class UserService implements UserServiceInt {
    private static UserService userService;

    private UserService() {
    }
    public static UserService getUserService(){
        if(userService==null){
            userService=new UserService();
        }return userService;
    }

    @Override
    public User create(User user) {
        return userService.create(user);
    }

    @Override
    public User update(User user) {
        return userService.update(user);
    }

    @Override
    public void delete(String id) {
        userService.delete(id);
    }

    @Override
    public User read(String id) {
        return userService.read(id);
    }

    @Override
    public ArrayList<User> readAlll() {
        return userService.readAlll();
    }
}
