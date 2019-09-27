package company.com.factory.services;


import company.com.service.payment.customerPay.impl.CustomerPayService;

public class CustomerPayServiceFact {
    public static CustomerPayService getCustPayRep() {
        return CustomerPayService.getCustomerPayService();
    }
}
