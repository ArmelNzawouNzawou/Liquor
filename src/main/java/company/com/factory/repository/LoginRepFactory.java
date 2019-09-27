package company.com.factory.repository;

import company.com.repository.user.impl.LoginRep;

public class LoginRepFactory {
    public static LoginRep getLogin(){
        return LoginRep.getLoginRep();
    }
}
