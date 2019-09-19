package repository.item.impl.classic.impl;


import domain.item.impl.classic.impl.Chips;
import repository.item.impl.classic.ChipsInt;

import java.util.ArrayList;

public class ChipsRep implements ChipsInt {
    private static ChipsRep chipsRepl;
    private ChipsRep() {
    }
    public static ChipsRep getChipsRepl(){
        if(chipsRepl==null){
            chipsRepl=new ChipsRep();
        }return chipsRepl;
    }


    @Override
    public Chips create(Chips chips) {
        return null;
    }

    @Override
    public Chips update(Chips chips) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Chips read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
