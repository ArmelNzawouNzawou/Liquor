package company.com.factory.services;

import company.com.service.address.Impl.AddressService;

public class AddressServiceFactory {
    public static AddressService getAddress(){
        return AddressService.getAddressService();
    }
}
