package company.com.repository.item.impl.impl;

import company.com.domain.item.impl.beverage.nonalcohol.NonAlcohol;
import company.com.repository.item.NonAlcoholInt;

import java.util.ArrayList;

public class NonAlcholRep implements NonAlcoholInt {
    private ArrayList<NonAlcohol>mydb=new ArrayList<>();
    private static NonAlcholRep nonAlcholRep;
    private NonAlcholRep(){

    }
    public static NonAlcholRep getNonAlcholRep(){
        if(nonAlcholRep==null){
            nonAlcholRep=new NonAlcholRep();
        }return nonAlcholRep;
    }
    @Override
    public NonAlcohol create(NonAlcohol nonAlcohol) {
        NonAlcohol result=findAlcohol(nonAlcohol.getAlcohol_id());
        if(result==null){
            mydb.add(nonAlcohol);
            return nonAlcohol;
        }
        return null;
    }

    @Override
    public NonAlcohol update(NonAlcohol nonAlcohol) {
        NonAlcohol result=findAlcohol(nonAlcohol.getAlcohol_id());
        if(result!=null){
            delete(result.getAlcohol_id());
            return create(nonAlcohol);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        NonAlcohol result=findAlcohol(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public NonAlcohol read(String s) {
        NonAlcohol result=findAlcohol(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<NonAlcohol> readAll() {
        return mydb;
    }


    public NonAlcohol findAlcohol(String id){
        return mydb.stream()
                .filter(C ->C.getAlcohol_id().equals(id))
                .findAny()
                .orElse(null);
    }
}
