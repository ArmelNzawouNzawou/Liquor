package factory.domain.bridge;

import domain.bridge.Cashier_Address;
import domain.customerBuilder.Customer;
import domain.users.Address;

public class Cashier_AddressFactory {
    public static Cashier_Address getCustomer_Address(Customer customer, Address address){
        return new Cashier_Address.Builder(customer).buildAdress(address).build();
    }
}
