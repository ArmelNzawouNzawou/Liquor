package company.com.repository.user.impl;

import company.com.domain.users.Login;
import company.com.factory.domain.user.LoginFactory;
import company.com.factory.repository.LoginRepFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginRepTest {


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        Login login= LoginFactory.getLogin("esapoi@.com","dfdfds","yeah!");
        LoginRep loginRep= LoginRepFactory.getLogin();
       // loginRep.create(login);
        System.out.println(loginRep.create(login).toString());
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
    public void readAll() {
    }

    @Test
    public void findLonginWithEmail() {
    }

    @Test
    public void findLongin() {
    }
}