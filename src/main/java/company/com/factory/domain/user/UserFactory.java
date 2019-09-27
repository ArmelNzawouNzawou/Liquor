package company.com.factory.domain.user;

import company.com.domain.users.User;

public class UserFactory {
    public static User getUser( String id,String Name, String SurName){
        return new User.Builder(id)
                .buildSuName(SurName)
                .buildName(Name)
                .build();
    }
}
