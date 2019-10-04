package company.com.factory.domain.generic;

import company.com.domain.genericClasses.G_User;

public class G_userFactory {
    public static G_User getUser(String stat,String email,String Name,String SurName,String UserType,String password){
        return new G_User.Builder(email)
                .buildName(Name)
                .buildPassword(password)
                .buildStat(stat)
                .buildSuName(SurName)
                .buildUserTpe(UserType)
                .build();
    }
    public static G_User updateUser(String stat,String id,String Name,String SurName,String UserType,String password){
return null;
    }
}
