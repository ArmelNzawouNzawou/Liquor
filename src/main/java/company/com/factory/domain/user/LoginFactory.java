package company.com.factory.domain.user;

import company.com.domain.users.Login;

public class LoginFactory {
    public static Login getLogin(String email, String password, String userId){
        return new Login.Builder(email)
                .buildPassword(password)
                .buildUserId(userId)
                .build();
    }
}
