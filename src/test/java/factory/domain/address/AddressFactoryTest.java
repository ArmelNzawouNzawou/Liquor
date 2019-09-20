package factory.domain.address;

import domain.users.Address;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AddressFactoryTest {
    Address address= AddressFactory.getAddress("espoirditekemena@","20 voortre","0617825205");


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAddress() {
        Assert.assertNotNull(address);
        System.out.println(address.toString());

    }
}