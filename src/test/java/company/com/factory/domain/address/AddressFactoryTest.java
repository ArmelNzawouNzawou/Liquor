package company.com.factory.domain.address;

import company.com.domain.users.Address;
import company.com.repository.address.AddressInt;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class AddressFactoryTest {
    @Autowired
    AddressInt addressInt;
    Address address= AddressFactory.getAddress("espoirditekemena@","20 voortre","0617825205");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAddress() {
       // Assert.assertNotNull(address);
       // System.out.println(address.toString());
        Assert.assertNotNull(this.addressInt.save(address));

    }
//[{"userId":"8 Rebeik stree","phoner_Number":"1","address":"espoir@gmail.com","emailAddress":"0617825205"}]
    @Test
    public void getAddress1() {
    }
}