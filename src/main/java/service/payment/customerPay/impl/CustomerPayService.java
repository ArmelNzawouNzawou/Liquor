package service.payment.customerPay.impl;

import domain.customerPayment.CustomerPay;
import factory.repository.CustomerPayRepFact;
import repository.payment.customerPay.impl.CustomerPayRep;
import service.payment.customerPay.CustomerPayInt;

import java.util.ArrayList;

public class CustomerPayService implements CustomerPayInt {
    private static CustomerPayService customerPayService;
    private CustomerPayRep customerPayRep= CustomerPayRepFact.getCustPayRep();

    private CustomerPayService() {
    }
    public static CustomerPayService getCustomerPayService(){
        if(customerPayService==null){
            customerPayService=new CustomerPayService();
        }return customerPayService;
    }

    @Override
    public CustomerPay create(CustomerPay customerPay) {
        return customerPayRep.create(customerPay);
    }

    @Override
    public CustomerPay update(CustomerPay customerPay) {
        return customerPayRep.update(customerPay);
    }

    @Override
    public void delete(String id) {
        customerPayRep.delete(id);
    }

    @Override
    public CustomerPay read(String id) {
        return customerPayRep.read(id);
    }

    @Override
    public ArrayList<CustomerPay> readAlll() {
        return customerPayRep.readAll();
    }
}
