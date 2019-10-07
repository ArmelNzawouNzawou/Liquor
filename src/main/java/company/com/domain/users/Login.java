package company.com.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    private String email;
    private String password;
    private String userId;

    private Login() {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public static class Builder{
        private String email;
        private String password;
        private String userId;
         public Builder(String email){
             this.email=email;
         }
         public Builder buildPassword(String password){
             this.password=password;
             return this;
         }
         public Builder buildUserId(String userId){
             this.userId=userId;
             return this;
         }
         public Login build(){
             Login longin =new Login();
             longin.email=this.email;
             longin.password=this.password;
             longin.userId=this.userId;
             return longin;
         }
    }
}
