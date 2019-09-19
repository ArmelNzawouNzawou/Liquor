package factory.domain.customerFactory;

import com.domain.customerBuilder.Customer;

public class CustomerFactory {
    public Customer getCustomer(String name, String SurName, String emailAddress, String address, String phone_number, String customer_number)
    {
        return new Customer.Builder(emailAddress)
                .buildAddress(address)
                .buildName(name)
                .buildPhoneNumber(phone_number)
                .buildSurname(SurName)
                .id(customer_number)
                .build();
    }
}
