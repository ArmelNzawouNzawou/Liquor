package company.com.factory.domain.address;


import company.com.domain.users.Address;

public class AddressFactory {
    public static Address getAddress(String emailAddress, String address, String phoner_Number){
        return new Address.Builder(emailAddress)
                .buildPhoneNumber(phoner_Number)
                .buildAddress(address)
                .build();
    }

}
