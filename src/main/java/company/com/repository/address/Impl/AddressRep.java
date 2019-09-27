package company.com.repository.address.Impl;



import company.com.domain.users.Address;
import company.com.repository.address.AddressInt;

import java.util.ArrayList;

public class AddressRep implements AddressInt {

    private ArrayList<Address>mydb=new ArrayList<>();
    private static AddressRep addressRep;

    private AddressRep() {

    }
    public static AddressRep getAddressRep(){
        if(addressRep==null){
            addressRep=new AddressRep();
        }return addressRep;
    }

    @Override
    public Address create(Address address) {
       Address result=findAddress(address.getEmailAddress());
       if(result==null){
           mydb.add(address);
           return address;
       }else return null;
    }

    @Override
    public Address update(Address address) {
        Address result=findAddress(address.getEmailAddress());
        if(result!=null){
            delete(address.getEmailAddress());

            return create(address);
        }else return null;
    }

    @Override
    public void delete(String s) {
        Address result=findAddress(s);
        if(result!=null){mydb.remove(result);}
    }

    @Override
    public Address read(String id) {
        Address result=findAddress(id);
        if(result!=null){
            return result;
        }else return null;
    }

    @Override
    public ArrayList<Address> readAll() {
        return mydb;
    }


    public Address findAddress(String id){
        return mydb.stream()
                .filter(A -> A.getEmailAddress().equals(id))
                .findAny()
                .orElse(null);
    }
}
