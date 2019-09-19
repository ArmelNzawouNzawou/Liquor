package domain.users;

public class Address {
    private String EmailAddress;
    private String Address;
    private String phoner_Number;

    private Address() {
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
                "EmailAddress='" + EmailAddress + '\'' +
                ", Address='" + Address + '\'' +
                ", phoner_Number='" + phoner_Number + '\'' +
                '}';
    }
    public static class Builder{
        private String emailAddress;
        private String address;
        private String phoner_Number;
        public Builder(String emailAddress){
            this.emailAddress=emailAddress;

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
            address.Address=this.address;
            address.EmailAddress=this.emailAddress;
            address.phoner_Number=this.phoner_Number;
            return address;
        }
    }

}
