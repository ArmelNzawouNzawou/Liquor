package company.com.domain.bridge;

import company.com.domain.customerBuilder.Customer;
import company.com.domain.users.Address;

public class Customer_address {
    private Customer customer;
    private Address address;

    private Customer_address() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public static class Builder{
        private Customer customer;
        private Address address;

        public Builder(Customer customer){
            this.customer=customer;
        }
        public Builder buildAdress(Address address){
            this.address=address;
            return this;
        }
        public Customer_address build(){
            Customer_address cash =new Customer_address();
            cash.address=this.address;
            cash.customer=this.customer;
            return cash;
        }
    }







}
