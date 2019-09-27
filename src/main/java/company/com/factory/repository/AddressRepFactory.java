package company.com.factory.repository;

import company.com.repository.address.Impl.AddressRep;

public class AddressRepFactory {
    public static AddressRep getAddress(){
        return AddressRep.getAddressRep();
    }
}
