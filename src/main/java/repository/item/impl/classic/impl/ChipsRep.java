package repository.item.impl.classic.impl;


import domain.item.impl.classic.impl.Chips;
import repository.item.impl.classic.ChipsInt;

import java.util.ArrayList;

public class ChipsRep implements ChipsInt {
    private static ChipsRep chipsRepl;
    private ArrayList<Chips>mydb=new ArrayList<>();
    private ChipsRep() {
    }
    public static ChipsRep getChipsRepl(){
        if(chipsRepl==null){
            chipsRepl=new ChipsRep();
        }return chipsRepl;
    }


    @Override
    public Chips create(Chips chips) {
        Chips result=findCooldrink(chips.getId());
        if(result==null){
            mydb.add(chips);
            return chips;
        }
        return null;
    }

    @Override
    public Chips update(Chips chips) {
        Chips result=findCooldrink(chips.getId());
        if(result!=null){
           delete(result.getId());
            return create(chips);
        }
        return null;
    }

    @Override
    public void delete(String s) {

        Chips result=findCooldrink(s);
        if(result==null){
           mydb.remove(result);
        }
    }

    @Override
    public Chips read(String s) {
        Chips result=findCooldrink(s);
        if(result==null){
            return result;
        }else return null;
    }

    @Override
    public ArrayList<Chips> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Chips findCooldrink(String id){
        return mydb.stream()
                .filter(C ->C.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
