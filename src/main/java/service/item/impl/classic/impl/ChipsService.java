package service.item.impl.classic.impl;


import domain.item.impl.classic.impl.Chips;
import factory.domain.item.impl.classic.impl.ChipsFactory;
import factory.repository.item.impl.classic.impl.ChipsRepFactyory;
import repository.item.impl.classic.impl.ChipsRep;
import service.item.impl.classic.ChipsInt;

import java.util.ArrayList;

public class ChipsService implements ChipsInt {

    private static ChipsService chipsRepl;
    private ChipsRep chipsRep= ChipsRepFactyory.getChipsRep();
    private ChipsService() {
    }
    public static ChipsService getChipsRepl(){
        if(chipsRepl==null){
            chipsRepl=new ChipsService();
        }return chipsRepl;
    }


    @Override
    public Chips create(Chips chips) {
        return chipsRep.create(chips);
    }

    @Override
    public Chips update(Chips chips) {
        return chipsRep.update(chips);
    }

    @Override
    public void delete(String id) {
        chipsRep.delete(id);
    }

    @Override
    public Chips read(String id) {
        return chipsRep.read(id);
    }

    @Override
    public ArrayList<Chips> readAlll() {
        return chipsRep.readAll();
    }
}
