package company.com.service.customerServ.impl;

import company.com.domain.customerBuilder.Customer;
import company.com.factory.repository.CustomerRepoFac;
import company.com.repository.customer.CustomerRepository;
import company.com.service.customerServ.CustomerServiceInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class CustomerService implements CustomerServiceInt {
    private static CustomerService customer=null;

    //Getting the company.com.repository class.

    CustomerRepository rep= CustomerRepoFac.getCustomerRepository();
    private CustomerService() {

    }

    public static CustomerService getCustomer() {
         if(customer==null)
         {
             customer=new CustomerService();
         }
         return customer;

    }

    @Override
    public Customer create(Customer customerProduct) {
        return rep.create(customerProduct);
    }

    @Override
    public Customer update(Customer customerProduct) {
        return rep.update(customerProduct);
    }

    @Override
    public void delete(String id) {
        rep.delete(id);
    }

    @Override
    public Customer read(String id) {
        return rep.read(id);
    }

    @Override
    public ArrayList readAlll() {
        return rep.readAll();
    }
}
