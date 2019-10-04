package company.com.service.user.impl;

import company.com.domain.users.User;
import company.com.factory.repository.UserRepFactory;
import company.com.repository.user.impl.UserRep;
import company.com.service.user.UserServiceInt;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class UserService implements UserServiceInt {
    private static UserService userService;
    private UserRep userRep=UserRepFactory.getUserRep();

    private UserService() {
    }
    public static UserService getUserService(){
        if(userService==null){
            userService=new UserService();
        }return userService;
    }

    @Override
    public User create(User user) {
        return userRep.create(user);
    }

    @Override
    public User update(User user) {
        return userRep.update(user);
    }

    @Override
    public void delete(String id) {
        userRep.delete(id);
    }

    @Override
    public User read(String id) {
        return userRep.read(id);
    }

    @Override
    public ArrayList<User> readAlll() {
        return userRep.readAll();
    }
}
