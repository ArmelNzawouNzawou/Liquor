package company.com.domain.users;

public class User {
    private String id;
    private String Name;
    private String SurName;
    private String UserType;

    private User() {
    }
    public String getUserType() {
        return UserType;
    }
    public void setUserType(String userType) {
        UserType = userType;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", UserType='" + UserType + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String Name;
        private String SurName;
        private String UserType;
        public Builder(String id) {
            this.id=id;
        }
        public Builder buildName(String name){
            this.Name=name;
            return this;
        }
        public Builder buildSuName(String surName){
            this.SurName=surName;
            return this;
        }
        public Builder buildUserTpe(String userType){
            this.UserType=userType;
            return this;
        }
        public User build(){
            User user=new User();
            user.id=this.id;
            user.Name=this.Name;
            user.SurName=this.SurName;
            return user;
        }
    }
}
