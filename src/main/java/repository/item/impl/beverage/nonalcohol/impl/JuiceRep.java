package repository.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.Juice;
import repository.item.impl.beverage.nonalcohol.JuiceInt;

import java.util.ArrayList;

public class JuiceRep implements JuiceInt {
    private static JuiceRep juiceRep=null;

    private JuiceRep() {
    }
    public static JuiceRep getJuiceRep(){
        if(juiceRep==null){
            juiceRep=new JuiceRep();
        }return juiceRep;
    }


    @Override
    public Juice create(Juice juice) {
        return null;
    }

    @Override
    public Juice update(Juice juice) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Juice read(String s) {
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
