package company.com.repository.item.impl.classic.impl;

import company.com.domain.item.impl.classic.impl.Cigarate;
import company.com.repository.item.impl.classic.CigarateInt;

import java.util.ArrayList;

public class CigarateRep implements CigarateInt {

    private static CigarateRep cigarateRep=null;
    private ArrayList<Cigarate>mydb = new ArrayList<>();
    private CigarateRep() {
    }
public static CigarateRep getCigarateRep(){
        if(cigarateRep==null){
            cigarateRep=new CigarateRep();
        }return cigarateRep;
}

    @Override
    public Cigarate create(Cigarate cigarate) {
        Cigarate result = findCooldrink(cigarate.getId());
        if(result==null){
            mydb.add(cigarate);
            return cigarate;
        }
        return null;
    }

    @Override
    public Cigarate update(Cigarate cigarate) {
        Cigarate result = findCooldrink(cigarate.getId());
        if(result!=null){
            delete(result.getId());
            return create(cigarate);
        }
        return null;
    }

    @Override
    public void delete(String s) {

        Cigarate result = findCooldrink(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public Cigarate read(String s) {
        Cigarate result = findCooldrink(s);
        if(result!=null){
            return result;
        }return null;
    }

    @Override
    public ArrayList<Cigarate> readAll() {
        return mydb;
    }

    public Cigarate findCooldrink(String id){
        return mydb.stream()
                .filter(C ->C.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
