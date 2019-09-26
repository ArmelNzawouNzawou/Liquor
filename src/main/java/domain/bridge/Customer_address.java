package domain.bridge;

import domain.cashierBuilderPack.Cashier;
import domain.users.Address;

public class Customer_address {
    private Cashier cashier;
    private Address address;

    private Customer_address() {
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public static class Builder{
        private Cashier cashier;
        private Address address;

        public Builder(Cashier cashier){
            this.cashier=cashier;
        }
        public Builder buildAdress(Address address){
            this.address=address;
            return this;
        }
        public Customer_address build(){
            Customer_address cash =new Customer_address();
            cash.address=this.address;
            cash.cashier=this.cashier;
            return cash;
        }
    }
}
