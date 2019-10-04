package company.com.domain.driver;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {
    @Id
    private  String email;
    private String stat;
    private String name;
    private String SurName;


    private Driver() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String id) {
        this.email = id;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + email + '\'' +
                ", stat='" + stat + '\'' +
                ", name='" + name + '\'' +
                ", SurName='" + SurName + '\'' +
                '}';
    }

    public static class Builder{
        private  String email;
        private String stat;
        private String name;
        private String surName;

        public Builder(String email){
            this.email=email;
        }

        public Builder buildStat(String stat){
            this.stat=stat;
            return this;
        }
        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildSurname(String surName) {
            this.surName = surName;
            return this;
        }
        public Driver build(){
            Driver driver=new Driver();
            driver.email=this.email;
            driver.stat=this.stat;
            driver.name=this.name;
            driver.SurName=this.surName;
            return driver;
        }
    }
}
