package service.item.impl.classic.impl;

import domain.item.impl.classic.impl.Cigarate;
import factory.repository.item.impl.classic.impl.CigarateRepFactory;
import repository.item.impl.classic.impl.CigarateRep;
import service.item.impl.classic.CigarateInt;

import java.util.ArrayList;

public class CigarateService implements CigarateInt {

    private static CigarateService cigarateRep=null;
    private CigarateRep cigarate= CigarateRepFactory.getCigarateRep();
    private CigarateService() {
    }
public static CigarateService getCigarateRep(){
        if(cigarateRep==null){
            cigarateRep=new CigarateService();
        }return cigarateRep;
}


    @Override
    public Cigarate create(Cigarate cigarate) {
        return this.cigarate.create(cigarate);
    }

    @Override
    public Cigarate update(Cigarate cigarate) {
        return this.cigarate.update(cigarate);
    }

    @Override
    public void delete(String id) {
        cigarate.delete(id);
    }

    @Override
    public Cigarate read(String id) {
        return null;
    }

    @Override
    public ArrayList<Cigarate> readAlll() {
        return cigarate.readAll();
    }
}
