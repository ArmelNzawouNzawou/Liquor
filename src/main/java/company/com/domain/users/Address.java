package company.com.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private String address_Id;
    private String Address;
    private String phone_Number;

    private Address() {
    }

    public String getAddress_Id() {
        return address_Id;
    }

    public void setAddress_Id(String address_Id) {
        this.address_Id = address_Id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + address_Id + '\'' +
                ", Address='" + Address + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                '}';
    }

    public static class Builder{
        private String address_Id;
        private String Address;
        private String phone_Number;


        public Builder(String address_Id){
            this.address_Id= address_Id;
        }

        public Builder buildAddress(String address){
            this.Address=address;
            return this;
        }
        public Builder buildPhoneNumber(String phone_Number){
            this.phone_Number=phone_Number;
            return this;
        }
        public Address build(){
            Address address=new Address();
            address.address_Id=this.address_Id;
            address.Address=this.Address;
            address.phone_Number=this.phone_Number;
            return address;
        }
    }

}
