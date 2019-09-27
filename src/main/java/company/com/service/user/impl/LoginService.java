package company.com.service.user.impl;

import company.com.domain.users.Login;
import company.com.factory.repository.LoginRepFactory;
import company.com.repository.user.impl.LoginRep;
import company.com.service.user.LoginServiceInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class LoginService implements LoginServiceInt {
    private LoginRep loginRep= LoginRepFactory.getLogin();
    private static LoginService loginService;
    private LoginService(){}
    public static LoginService getLoginService(){
        if(loginService==null){
            loginService=new LoginService();
        }return loginService;
    }
    @Override
    public Login create(Login login) {
        return loginRep.create(login);
    }

    @Override
    public Login update(Login login) {
        return loginRep.update(login);
    }

    @Override
    public void delete(String id) {
        loginRep.delete(id);
    }

    @Override
    public Login read(String id) {
        return loginRep.read(id);
    }

    @Override
    public ArrayList<Login> readAlll() {
        return loginRep.readAll();
    }
    public Login myLogin(String email,String password){
        return loginRep.findLongin(email,password);
    }
}
