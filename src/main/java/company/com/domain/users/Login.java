package company.com.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    private String email;
    private String password;
    private String token;

    private Login() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public static class Builder{
        private String email;
        private String password;
        private String token;
         public Builder(String email){
             this.email=email;
         }
         public Builder buildPassword(String password){
             this.password=password;
             return this;
         }
         public Builder buildToken(String token){
             this.token=token;
             return this;
         }

         public Login build(){
             Login longin =new Login();
             longin.email=this.email;
             longin.password=this.password;
             longin.token=this.token;
             return longin;
         }
    }
}
