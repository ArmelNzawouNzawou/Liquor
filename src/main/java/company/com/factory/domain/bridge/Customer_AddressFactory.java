package company.com.factory.domain.bridge;

import company.com.domain.bridge.Customer_address;
import company.com.domain.customerBuilder.Customer;
import company.com.domain.users.Address;

public class Customer_AddressFactory {
    public static Customer_address getCustomerAddress(Customer customer, Address address){
        return new Customer_address.Builder(customer).buildAdress(address).build();
    }
}
