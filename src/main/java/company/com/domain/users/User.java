package company.com.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String email;
    private String name;
    private String SurName;
    private String UserType;
    private String description;


    private User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
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
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", UserType='" + UserType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String email;
        private String name;
        private String SurName;
        private String UserType;
        private String description;

        public Builder buildDescri(String description){
            this.description=description;
            return this;
        }
        public Builder buildName(String name) {
            this.name = name;
            return this;
        }
        public Builder buildSurname(String surName) {
            this.SurName = surName;
            return this;
        }
        public Builder(String email) {
            this.email=email;
        }


        public Builder buildUserTpe(String userType){
            this.UserType=userType;
            return this;
        }

        public User build(){
            User user=new User();
            user.email=this.email;
            user.UserType=this.UserType;
            user.description=this.description;
            user.name = this.name;
            user.SurName = this.SurName;
            return user;
        }
    }
}
