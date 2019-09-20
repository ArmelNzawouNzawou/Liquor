package repository.payment.customerPay.impl;

import domain.customerPayment.CustomerPay;
import repository.payment.customerPay.CustomerPayInt;

import java.util.ArrayList;

public class CustomerPayRep implements CustomerPayInt {
    private static CustomerPayRep customerPayRep=null;

    private CustomerPayRep() {
    }

    public static CustomerPayRep getcustomerPayRep(){
        if(customerPayRep==null){
            customerPayRep=new CustomerPayRep();
        }return customerPayRep;
    }
    @Override
    public CustomerPay create(CustomerPay customerPay) {
        return null;
    }

    @Override
    public CustomerPay update(CustomerPay customerPay) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public CustomerPay read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
