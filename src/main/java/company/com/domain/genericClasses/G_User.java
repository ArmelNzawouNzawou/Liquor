package company.com.domain.genericClasses;

public class G_User {
    private String stat;
    private String email;
    private String Name;
    private String SurName;
    private String UserType;
    private String password;

    private G_User() {
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String email) {
        this.email = email;
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

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "G_User{" +
                "stat='" + stat + '\'' +
                ", id='" + email + '\'' +
                ", Name='" + Name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", UserType='" + UserType + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public static class Builder{
        private String stat;
        private String email;
        private String Name;
        private String SurName;
        private String UserType;
        private String password;

        public Builder(String email){
            this.email=email;
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
        public Builder buildStat(String stat){
            this.stat=stat;
            return this;
        }
        public Builder buildPassword(String password){
            this.password=password;
            return this;
        }
        public G_User build(){
            G_User g=new G_User();
            g.email=this.email;
            g.Name=this.Name;
            g.password=this.password;
            g.stat=this.stat;
            g.SurName=this.SurName;
            g.password=this.password;
            g.UserType=this.UserType;
            return g;
        }
    }
}
