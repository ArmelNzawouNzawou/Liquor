package company.com.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String email;
    private String password;
    private String UserType;
    private String description;



    private User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserType() {
        return UserType;
    }
    public void setUserType(String userType) {
        UserType = userType;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + email + '\'' +
                ", Name='" + password + '\'' +
                ", UserType='" + UserType + '\'' +
                '}';
    }

    public static class Builder{
        private String email;
        private String password;
        private String UserType;
        private String description;

        public Builder buildDescri(String description){
            this.description=description;
            return this;
        }
        public Builder(String email) {
            this.email=email;
        }
        public Builder buildPassword(String password){
            this.password=password;
            return this;
        }

        public Builder buildUserTpe(String userType){
            this.UserType=userType;
            return this;
        }

        public User build(){
            User user=new User();
            user.email=this.email;
            user.password=this.password;
            user.UserType=this.UserType;
            user.description=this.description;
            return user;
        }
    }
}
