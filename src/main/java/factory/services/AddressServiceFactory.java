package factory.services;

import repository.address.Impl.AddressRep;
import service.address.Impl.AddressService;

public class AddressServiceFactory {
    public static AddressService getAddress(){
        return AddressService.getAddressService();
    }
}
