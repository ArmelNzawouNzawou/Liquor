package company.com.service.item.impl.classic.impl;


import company.com.domain.item.impl.classic.impl.Chips;
import company.com.factory.repository.item.impl.classic.impl.ChipsRepFactyory;
import company.com.repository.item.impl.classic.impl.ChipsRep;
import company.com.service.item.impl.classic.ChipsInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
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
