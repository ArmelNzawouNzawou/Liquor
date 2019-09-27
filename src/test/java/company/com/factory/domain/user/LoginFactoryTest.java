package company.com.factory.domain.user;

import company.com.domain.users.Login;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginFactoryTest {

    @Test
    public void getLogin() {
        Login login=LoginFactory.getLogin("esapoi@.com","dfdfds","yeah!");
        System.out.println(login.toString());
    }
}