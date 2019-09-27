package company.com.repository.item.impl.classic.impl;

import company.com.domain.item.impl.classic.impl.Ice;
import company.com.repository.item.impl.classic.IceInt;

import java.util.ArrayList;

public class IceRep implements IceInt {

    private static IceRep iceRep;
    private ArrayList<Ice> mydb= new ArrayList<>();

    private IceRep() {
    }
public static IceRep getIceRep(){
        if(iceRep==null){
            iceRep=new IceRep();
        }return iceRep;
}

    @Override
    public Ice create(Ice ice) {
        Ice result = findIce(ice.getItemNumber());
        if(result==null){
            mydb.add(ice);
            return ice;
        }
        return null;
    }

    @Override
    public Ice update(Ice ice) {
        Ice result = findIce(ice.getItemNumber());
        if(result!=null){
           delete(result.getItemNumber());
            return create(ice);
        }
        return null;
    }

    @Override
    public void delete(String s) {

        Ice result = findIce(s);
        if(result!=null){
            mydb.remove(result);

        }
    }

    @Override
    public Ice read(String s) {
        Ice result = findIce(s);
        if(result!=null){

            return result;
        }return null;
    }

    @Override
    public ArrayList<Ice> readAll() {
        return mydb;
    }

    public Ice findIce(String id){
        return mydb.stream()
                .filter(C ->C.getItemNumber().equals(id))
                .findAny()
                .orElse(null);
    }
}
