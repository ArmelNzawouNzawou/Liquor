package company.com.factory.services;


import company.com.service.customerServ.impl.CustomerService;

public class CustomerServiceFac {

    public static CustomerService getCustomerRepository() {
        return CustomerService.getCustomer();

    }
}
