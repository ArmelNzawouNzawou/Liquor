package domain.bridge;

import domain.customerBuilder.Customer;
import domain.users.Address;

public class Cashier_Address {
    private Customer customer;
    private Address address;

    private Cashier_Address() {
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
        public Cashier_Address build(){
            Cashier_Address cash =new Cashier_Address();
            cash.address=this.address;
            cash.customer=this.customer;
            return cash;
        }
    }
}
