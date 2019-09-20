package repository.item.impl.classic.impl;

import domain.item.impl.classic.impl.Ice;
import repository.item.impl.classic.IceInt;

import java.util.ArrayList;

public class IceRep implements IceInt {

    private static IceRep iceRep;

    private IceRep() {
    }
public static IceRep getIceRep(){
        if(iceRep==null){
            iceRep=new IceRep();
        }return iceRep;
}

    @Override
    public Ice create(Ice ice) {
        return null;
    }

    @Override
    public Ice update(Ice ice) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Ice read(String s) {
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
