package service.payService.CustomerPayService;

import com.domain.customerPayment.customerPaymentBuilder.product.CustPayment;
import com.factory.repository.CustomerPayFact;
import com.repository.payment.customerPay.CustomerPayRep;

import java.util.ArrayList;

public class CustomerPayServ implements CustomerPayServInt {
    private static CustomerPayServ custo=null;

    CustomerPayFact customerPayFact=new CustomerPayFact();
    CustomerPayRep customerPayRep= customerPayFact.getCustPayRep("customerRep");

    private CustomerPayServ() {
    }

    public static CustomerPayServ getCusto() {
        if(custo==null)
        {
            custo=new CustomerPayServ();
        }return custo;
    }

    @Override
    public CustPayment create(CustPayment custPayment) {
        return customerPayRep.create(custPayment);
    }

    @Override
    public CustPayment update(CustPayment custPayment) {
        return customerPayRep.update(custPayment);
    }

    @Override
    public void delete(String id) {
        customerPayRep.delete(id);

    }

    @Override
    public CustPayment read(String id) {
        return customerPayRep.read(id);
    }

    @Override
    public ArrayList readAlll() {
        return customerPayRep.getAll();
    }
}
