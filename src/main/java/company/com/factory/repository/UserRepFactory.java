package company.com.factory.repository;

import company.com.repository.user.impl.UserRep;

public class UserRepFactory {
    public static UserRep getUserRep(){
        return UserRep.getUserRep();
    }
}
