package factory.domain.customerFactory;

import domain.customerBuilder.Customer;
import util.IdGenerator;

public class CustomerFactory {
    public static Customer getCustomer(String name, String SurName)
    {
        return new Customer.Builder(IdGenerator.getSuffixFromClassName(Customer.class))
                .buildName(name)
                .buildSurname(SurName)
                .build();
    }
    public static Customer updateCustomer(String name, String SurName, String customer_number)
    {
        return new Customer.Builder(customer_number)
                .buildName(name)
                .buildSurname(SurName)
                .build();
    }
}
