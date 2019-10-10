package company.com.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private String addressId;
    private String Address;
    private String phoner_Number;

    private Address() {
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
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
                "addressId='" + addressId + '\'' +
                ", Address='" + Address + '\'' +
                ", phoner_Number='" + phoner_Number + '\'' +
                '}';
    }

    public static class Builder{
        private String addressId;
        private String Address;
        private String phoner_Number;


        public Builder(String addressId){
            this.addressId=addressId;
        }

        public Builder buildAddress(String address){
            this.Address=address;
            return this;
        }
        public Builder buildPhoneNumber(String phoner_Number){
            this.phoner_Number=phoner_Number;
            return this;
        }
        public Address build(){
            Address address=new Address();
            address.addressId=this.addressId;
            address.Address=this.Address;
            address.phoner_Number=this.phoner_Number;
            return address;
        }
    }

}
