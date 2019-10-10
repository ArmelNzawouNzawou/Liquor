package company.com.factory.domain.user;

import company.com.domain.users.Login;

public class LoginFactory {
    public static Login getLogin(String email, String password,String token){
        return new Login.Builder(email)
                .buildToken(token)
                .buildPassword(password)
                .build();
    }
}
