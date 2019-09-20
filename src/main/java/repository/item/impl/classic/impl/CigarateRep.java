package repository.item.impl.classic.impl;

import domain.item.impl.classic.impl.Cigarate;
import repository.item.impl.classic.CigarateInt;

import java.util.ArrayList;

public class CigarateRep implements CigarateInt {

    private static CigarateRep cigarateRep=null;
    private CigarateRep() {
    }
public static CigarateRep getCigarateRep(){
        if(cigarateRep==null){
            cigarateRep=new CigarateRep();
        }return cigarateRep;
}

    @Override
    public Cigarate create(Cigarate cigarate) {
        return null;
    }

    @Override
    public Cigarate update(Cigarate cigarate) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Cigarate read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
