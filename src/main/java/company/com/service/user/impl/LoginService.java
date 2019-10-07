package company.com.service.user.impl;

import company.com.domain.users.Login;
import company.com.factory.repository.LoginRepFactory;
import company.com.repository.user.LoginRepInt;
import company.com.repository.user.impl.LoginRep;
import company.com.service.user.LoginServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class LoginService implements LoginServiceInt {
    @Autowired
    LoginRepInt longinRepInt;
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
        return longinRepInt.save(login);
    }

    @Override
    public Login update(Login login) {
        return longinRepInt.save(login);
    }

    @Override
    public void delete(String id) {
        longinRepInt.deleteById(id);
    }

    @Override
    public Login read(String id) {
        Optional<Login> result=longinRepInt.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Login> readAlll() {
        return longinRepInt.findAll();
    }

    public Login myLogin(String email,String password){
        List<Login>result=readAlll();
        for(Login login: result){
            if(login.getEmail().equals(email)&&login.getPassword().equals(password)){
                return login;
            }
        }
        return null;
    }
}
