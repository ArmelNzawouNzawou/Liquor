package company.com.service.customerServ.impl;

import company.com.domain.customerBuilder.Customer;
import company.com.factory.repository.CustomerRepoFac;
import company.com.repository.customer.CustomerRep;
import company.com.repository.customer.impl.CustomerRepository;
import company.com.service.customerServ.CustomerServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerServiceInt {
    private static CustomerService customer=null;

    @Autowired
    CustomerRep customerRep;

    //CustomerRepository rep= CustomerRepoFac.getCustomerRepository();
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
        return customerRep.save(customerProduct);
    }

    @Override
    public Customer update(Customer customerProduct) {
        return customerRep.save(customerProduct);
    }

    @Override
    public void delete(String id) {
        customerRep.deleteById(id);
    }

    @Override
    public Customer read(String id) {
        Optional<Customer> myCustomer=customerRep.findById(id);

        return myCustomer.orElse(null);
    }

    @Override
    public List<Customer> readAlll() {
        return customerRep.findAll();
    }
}
