package company.com.factory.domain.user;

import company.com.domain.users.User;
import company.com.util.IdGenerator;

public class UserFactory {
    public static User getUser(String email, String password,String userType,String description){
        return new User.Builder(email)
                .buildDescri(description)
                .buildPassword(password)
                .buildUserTpe(userType)
                .build();
    }
}
