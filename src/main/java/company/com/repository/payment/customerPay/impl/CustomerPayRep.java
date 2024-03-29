package company.com.repository.payment.customerPay.impl;

import company.com.domain.customerPayment.CustomerPay;
import company.com.repository.payment.customerPay.CustomerPayInt;

import java.util.ArrayList;

public class CustomerPayRep implements CustomerPayInt {
    private static CustomerPayRep customerPayRep=null;
    private ArrayList<CustomerPay>mydb=new ArrayList<>();

    private CustomerPayRep() {
    }

    public static CustomerPayRep getcustomerPayRep(){
        if(customerPayRep==null){
            customerPayRep=new CustomerPayRep();
        }return customerPayRep;
    }
    @Override
    public CustomerPay create(CustomerPay customerPay) {
        CustomerPay result=findCustomerPay(customerPay.getCustomerNumber());
        if(result==null){
            mydb.add(customerPay);
            return customerPay;
        }
        return null;
    }

    @Override
    public CustomerPay update(CustomerPay customerPay) {
        CustomerPay result=findCustomerPay(customerPay.getCustomerNumber());
        if(result==null){
           delete(result.getCustomerNumber());
            return create(customerPay);
        }
        return null;
    }

    @Override
    public void delete(String s) {

        CustomerPay result=findOrder(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public CustomerPay read(String s) {
        CustomerPay result=findCustomerPay(s);
        if(result!=null){
           return result;
        }
        return null;
    }
    public CustomerPay findOrder(String orderNumber){
        return mydb.stream()
                .filter(C ->C.getOrderNumber().equals(orderNumber))
                .findAny()
                .orElse(null);
    }


    @Override
    public ArrayList<CustomerPay> readAll() {
        return mydb;
    }


    /**
     * this method need to be checked up because one customer may have payed manytimes
     * actually the combination of customer nuber and ordernumber would be preffered
     * @param id
     * @return
     */
    public CustomerPay findCustomerPay(String id){
        return mydb.stream()
                .filter(C ->C.getCustomerNumber().equals(id))
                .findAny()
                .orElse(null);
    }
}
