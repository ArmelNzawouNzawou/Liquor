package service.item.impl.classic.impl;

import domain.item.impl.classic.impl.Ice;
import factory.repository.item.impl.classic.impl.IceRepFactory;
import repository.item.impl.classic.impl.IceRep;
import service.item.impl.classic.IceInt;

import java.util.ArrayList;

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
