package company.com.factory.domain.customerFactory;

import company.com.domain.customerBuilder.Customer;
import company.com.util.IdGenerator;

public class CustomerFactory {
    public static Customer getCustomer(String description) {
        return new Customer.Builder(IdGenerator.getSuffixFromClassName(CustomerFactory.class))
                .buildDescription(description)
                .build();
    }
}
