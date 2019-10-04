package company.com.factory.domain.customerFactory;

import company.com.domain.customerBuilder.Customer;
import company.com.util.IdGenerator;

public class CustomerFactory {
    public static Customer getCustomer(String email,String name, String SurName)
    {
        return new Customer.Builder(email)
                .buildName(name)
                .buildSurname(SurName)
                .build();
    }
}
