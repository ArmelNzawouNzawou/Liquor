package factory.services;


import repository.payment.customerPay.impl.CustomerPayRep;
import service.payment.customerPay.impl.CustomerPayService;

public class CustomerPayServiceFact {
    public static CustomerPayService getCustPayRep() {
        return CustomerPayService.getCustomerPayService();
    }
}
