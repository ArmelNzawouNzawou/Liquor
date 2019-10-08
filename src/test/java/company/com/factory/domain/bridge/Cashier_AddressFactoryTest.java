package company.com.factory.domain.bridge;

import company.com.domain.bridge.Cashier_Address;
import company.com.domain.cashierBuilderPack.Cashier;
import company.com.domain.customerBuilder.Customer;
import company.com.domain.users.Address;
import company.com.factory.domain.address.AddressFactory;
import company.com.factory.domain.cashierFactory.CashierFactory;
import company.com.factory.domain.customerFactory.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Cashier_AddressFactoryTest {
    Address address= AddressFactory.getAddress("espoirditekemena@","20 voortre","0617825205");
    private Cashier cashier= CashierFactory.getCashier("noxolo","dian");

   Cashier_Address cashier_address=Cashier_AddressFactory.getCustomer_Address(cashier,address);
    @Test
    public void getCustomer_Address() {
        Assert.assertNotNull(cashier_address);
        System.out.println(cashier_address.getAddress().toString());
        System.out.println(cashier_address.getCashier().toString());
    }
}