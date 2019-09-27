package company.com.service.user.impl;

import company.com.domain.users.Login;
import company.com.factory.domain.user.LoginFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {


    @Test
    public void create() {
        LoginService loginService=LoginService.getLoginService();
        Login login= LoginFactory.getLogin("esapoi@.com","dfdfds","yeah!");
        System.out.println(loginService.create(login).toString());
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void readAlll() {
    }

    @Test
    public void myLogin() {
    }
}