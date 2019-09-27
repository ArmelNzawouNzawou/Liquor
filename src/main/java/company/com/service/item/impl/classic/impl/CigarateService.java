package company.com.service.item.impl.classic.impl;

import company.com.domain.item.impl.classic.impl.Cigarate;
import company.com.factory.repository.item.impl.classic.impl.CigarateRepFactory;
import company.com.repository.item.impl.classic.impl.CigarateRep;
import company.com.service.item.impl.classic.CigarateInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
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
