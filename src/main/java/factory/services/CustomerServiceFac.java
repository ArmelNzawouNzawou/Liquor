package factory.services;


import repository.customer.CustomerRepository;
import service.customerServ.CustomerService;

public class CustomerServiceFac {

    public static CustomerService getCustomerRepository() {
        return CustomerService.getCustomer();

    }
}
