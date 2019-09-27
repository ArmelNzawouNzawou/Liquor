package company.com.factory.repository;


import company.com.repository.payment.customerPay.impl.CustomerPayRep;

public class CustomerPayRepFact {
    public static CustomerPayRep getCustPayRep() {
        return CustomerPayRep.getcustomerPayRep();
    }
}
