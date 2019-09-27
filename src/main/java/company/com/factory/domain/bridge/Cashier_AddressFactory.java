package company.com.factory.domain.bridge;

import company.com.domain.bridge.Cashier_Address;
import company.com.domain.cashierBuilderPack.Cashier;
import company.com.domain.users.Address;

public class Cashier_AddressFactory {
    public static Cashier_Address getCustomer_Address(Cashier customer, Address address){
        return new Cashier_Address.Builder(customer).buildAdress(address).build();
    }
}
