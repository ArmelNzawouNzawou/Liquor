package factory.repository;


import repository.payment.customerPay.impl.CustomerPayRep;

public class CustomerPayFact {
    public CustomerPayRep getCustPayRep() {
        return CustomerPayRep.getcustomerPayRep();
    }
}
