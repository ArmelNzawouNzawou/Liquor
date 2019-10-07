package company.com.service.address.Impl;

import company.com.domain.users.Address;

import company.com.repository.address.AddressInt;
import company.com.service.address.AddressServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AddressService implements AddressServiceInt {
    private static AddressService addressService;
    // private AddressRep addressRep= AddressRepFactory.getAddress();
    @Autowired
    AddressInt addressRep;

    private AddressService() {
    }

    public static AddressService getAddressService() {
        if (addressService == null) {
            addressService = new AddressService();

        }
        return addressService;
    }

    @Override
    public Address create(Address address) {
        return addressRep.save(address);
    }

    @Override
    public Address update(Address address) {
        return addressRep.save(address);
    }

    @Override
    public void delete(String id) {
        addressRep.deleteById(id);
    }

    @Override
    public Address read(String id) {
        Optional<Address> result=addressRep.findById(id);
        addressRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Address> readAlll() {
        return addressRep.findAll();
    }
}
