package company.com.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private String userId;
    private String EmailAddress;
    private String Address;
    private String phoner_Number;

    private Address() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoner_Number() {
        return phoner_Number;
    }

    public void setPhoner_Number(String phoner_Number) {
        this.phoner_Number = phoner_Number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "userId='" + userId + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", Address='" + Address + '\'' +
                ", phoner_Number='" + phoner_Number + '\'' +
                '}';
    }

    public static class Builder{
        private String userId;
        private String emailAddress;
        private String address;
        private String phoner_Number;


        public Builder(String userId){
            this.userId=userId;
        }
        public Builder buildEmail(String emailAddress){
            this.emailAddress=emailAddress;
            return this;
        }
        public Builder buildAddress(String address){
            this.address=address;
            return this;
        }
        public Builder buildPhoneNumber(String phoner_Number){
            this.phoner_Number=phoner_Number;
            return this;
        }
        public Address build(){
            Address address=new Address();
            address.userId=this.userId;
            address.Address=this.address;
            address.EmailAddress=this.emailAddress;
            address.phoner_Number=this.phoner_Number;
            return address;
        }
    }

}
