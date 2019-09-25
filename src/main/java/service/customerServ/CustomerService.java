package service.customerServ;

import domain.customerBuilder.Customer;
import factory.repository.CustomerRepoFac;
import repository.customer.CustomerRepository;

import java.util.ArrayList;

public class CustomerService implements CustomerServiceInt {
    private static CustomerService customer=null;

    //Getting the repository class.

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
