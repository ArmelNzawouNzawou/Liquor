package company.com.repository.user.impl;

import company.com.domain.users.Login;
import company.com.repository.user.LoginRepInt;

import java.util.ArrayList;

public class LoginRep{}/** implements LoginRepInt {
    private static LoginRep loginRep;
    private ArrayList<Login>mydb=new ArrayList<>();

    private LoginRep(){}

    public static LoginRep getLoginRep(){
        if(loginRep==null){
            loginRep=new LoginRep();
        }return loginRep;
    }
    @Override
    public Login create(Login login) {
        Login result=findLonginWithEmail(login.getEmail());
        if(result==null){
            mydb.add(login);
            return login;
        }
        return null;
    }

    @Override
    public Login update(Login login) {
        System.out.println(login.getEmail());
        Login result=findLonginWithEmail(login.getEmail());
        if(result!=null){
            mydb.remove(result);
            mydb.add(login);
            return login;
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Login result=findLonginWithEmail(id );
        if(result!=null){
            mydb.remove(result);
        }
    }

    @Override
    public Login read(String id) {
        Login result=findLonginWithEmail(id );
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Login> readAll() {
        return mydb;
    }
    public Login findLonginWithEmail(String email){
        return mydb.stream().filter(L -> L.getEmail().equals(email))
                .findAny()
                .orElse(null);
    }

    public Login findLongin(String email,String password){
        return mydb.stream().filter(L -> L.getEmail().equals(email))
                .filter(L -> L.getPassword().equals(password))
                .findAny()
                .orElse(null);
    }
}
*/