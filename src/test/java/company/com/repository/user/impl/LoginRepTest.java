package company.com.repository.user.impl;

import company.com.domain.users.Login;
import company.com.factory.domain.user.LoginFactory;
import company.com.factory.repository.LoginRepFactory;
import company.com.repository.user.LoginRepInt;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class LoginRepTest {
@Autowired
    LoginRepInt loginRepInt;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        Login login= LoginFactory.getLogin("esapoi@.com","dfdfds","yeah!");
        System.out.println(loginRepInt.save(login).toString());
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