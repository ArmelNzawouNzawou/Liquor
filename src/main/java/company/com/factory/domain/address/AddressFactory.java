package company.com.factory.domain.address;


import company.com.domain.users.Address;
import company.com.util.IdGenerator;

public class AddressFactory {
    public static Address getAddress( String address, String phone_Number){
        return new Address.Builder(IdGenerator.getSuffixFromClassName(Address.class))
                .buildPhoneNumber(phone_Number)
                .buildAddress(address)
                .build();
    }
    public static Address updateAddress(String id,String emailAddress, String address, String phone_Number){
        return new Address.Builder(id)
                .buildPhoneNumber(phone_Number)
                .buildAddress(address)
                .build();
    }

}
