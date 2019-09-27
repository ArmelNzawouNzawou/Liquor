package company.com.service.item.impl.classic.impl;

import company.com.domain.item.impl.classic.impl.Ice;
import company.com.factory.repository.item.impl.classic.impl.IceRepFactory;
import company.com.repository.item.impl.classic.impl.IceRep;
import company.com.service.item.impl.classic.IceInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class IceService implements IceInt {

    private static IceService iceRep;
private IceRep iceR= IceRepFactory.getIceRep();
    private IceService() {
    }
public static IceService getIceRep(){
        if(iceRep==null){
            iceRep=new IceService();
        }return iceRep;
}


    @Override
    public Ice create(Ice ice) {
        return iceR.create(ice);
    }

    @Override
    public Ice update(Ice ice) {
        return iceR.update(ice);
    }

    @Override
    public void delete(String id) {
        iceR.delete(id);
    }

    @Override
    public Ice read(String id) {
        return iceR.read(id);
    }

    @Override
    public ArrayList<Ice> readAlll() {
        return iceR.readAll();
    }
}
