package factory.repository;


import repository.payment.customerPay.impl.CustomerPayRep;

public class CustomerPayRepFact {
    public static CustomerPayRep getCustPayRep() {
        return CustomerPayRep.getcustomerPayRep();
    }
}
