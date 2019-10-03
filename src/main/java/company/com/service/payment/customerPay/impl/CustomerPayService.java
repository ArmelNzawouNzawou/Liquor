package company.com.service.payment.customerPay.impl;

import company.com.domain.customerPayment.CustomerPay;
import company.com.factory.repository.CustomerPayRepFact;
import company.com.repository.payment.customerPay.impl.CustomerPayRep;
import company.com.service.payment.customerPay.CustomerPayInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
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
    public CustomerPay findOrder(String orderNumber){
        return customerPayRep.findOrder(orderNumber);
    }

    @Override
    public ArrayList<CustomerPay> readAlll() {
        return customerPayRep.readAll();
    }
}
