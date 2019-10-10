package company.com.domain.users.demography;

import company.com.domain.users.User;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDemography {
    @Id
    private String email;
    private String gender;
    private String description;

    private UserDemography() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserDemography{" +
                "email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String email;
        private String gender;
        private String description;
        public Builder(String email){
            this.email=email;
        }
        public Builder buildGender(String gender){
            this.gender=gender;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public UserDemography build(){
            UserDemography u=new UserDemography();
            u.description=this.description;
            u.email=this.email;
            u.gender=this.gender;
            return u;
        }
    }
}
