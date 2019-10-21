package company.com.service.address.Impl;

import company.com.domain.users.Address;
import company.com.factory.domain.address.AddressFactory;
import company.com.factory.services.AddressServiceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressServiceTest {
    private AddressService addressService= AddressServiceFactory.getAddress();
   // private Address address= AddressFactory.getAddress("@gmail.com","voorteker","061825205");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAddressService() {
    }

    @Test
    public void create() {
       // Address resutl=addressService.create(address);
       // Assert.assertNotNull(resutl);
        //System.out.println(resutl);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void readAlll() {
    }
}