package factory.repository;

import repository.address.Impl.AddressRep;

public class AddressRepFactory {
    public static AddressRep getAddress(){
        return AddressRep.getAddressRep();
    }
}
