package company.com.factory.repository;


import company.com.repository.customer.CustomerRepository;

public class CustomerRepoFac {

    public static CustomerRepository getCustomerRepository() {
        return CustomerRepository.getInstance();

    }
}
