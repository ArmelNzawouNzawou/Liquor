package company.com.factory.domain.address;


import company.com.domain.users.Address;
import company.com.util.IdGenerator;

public class AddressFactory {
    public static Address getAddress(String emailAddress, String address, String phoner_Number){
        return new Address.Builder(IdGenerator.getSuffixFromClassName(Address.class))
                .buildEmail(emailAddress)
                .buildPhoneNumber(phoner_Number)
                .buildAddress(address)
                .build();
    }
    public static Address updateAddress(String id,String emailAddress, String address, String phoner_Number){
        return new Address.Builder(id)
                .buildEmail(emailAddress)
                .buildPhoneNumber(phoner_Number)
                .buildAddress(address)
                .build();
    }

}
