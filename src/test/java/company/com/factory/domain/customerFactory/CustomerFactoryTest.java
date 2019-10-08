package company.com.factory.domain.customerFactory;

import company.com.domain.customerBuilder.Customer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerFactoryTest {
    private Customer customer =CustomerFactory.getCustomer("espoir","diteekemena","dire");

    @Test
    public void getCustomer() {
        Assert.assertNotNull(customer);
        System.out.println(customer.toString());
    }

    @Test
    public void updateCustomer() {
    }
}