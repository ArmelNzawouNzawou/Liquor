package service.address.Impl;

import domain.users.Address;
import factory.domain.address.AddressFactory;
import factory.services.AddressServiceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressServiceTest {
    private AddressService addressService= AddressServiceFactory.getAddress();
    private Address address= AddressFactory.getAddress("@gmail.com","voorteker","061825205");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAddressService() {
    }

    @Test
    public void create() {
        Address resutl=addressService.create(address);
        Assert.assertNotNull(resutl);
        System.out.println(resutl);
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