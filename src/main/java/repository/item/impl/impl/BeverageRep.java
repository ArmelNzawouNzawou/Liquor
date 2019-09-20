package repository.item.impl.impl;

import domain.item.impl.beverage.Beverage;
import repository.item.BevergeInt;

import java.util.ArrayList;

public class BeverageRep implements BevergeInt {
    private static BeverageRep beverageRep;

    private BeverageRep() {
    }
    public static BeverageRep getBeverageRep(){
        if(beverageRep==null){
            beverageRep=new BeverageRep();
        }return beverageRep;
    }


    @Override
    public Beverage create(Beverage beverage) {
        return null;
    }

    @Override
    public Beverage update(Beverage beverage) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Beverage read(String s) {
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
