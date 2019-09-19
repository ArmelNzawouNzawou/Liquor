package factory.repository;


import repository.customer.CustomerRepository;

public class CustomerRepoFac {

    public static CustomerRepository getCustomerRepository() {
        return CustomerRepository.getInstance();

    }
}
