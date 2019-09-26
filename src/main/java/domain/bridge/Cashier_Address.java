package domain.bridge;

import domain.cashierBuilderPack.Cashier;
import domain.customerBuilder.Customer;
import domain.users.Address;

public class Cashier_Address {
    private Cashier cashier;
    private Address address;

    private Cashier_Address() {
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
        public Cashier_Address build(){
            Cashier_Address cash =new Cashier_Address();
            cash.address=this.address;
            cash.cashier=this.cashier;
            return cash;
        }
    }
}
