package repository.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.CoolDrink;
import repository.item.impl.beverage.nonalcohol.CooledrinkInt;

import java.util.ArrayList;

public class CooledrinkRep implements CooledrinkInt {
private static CooledrinkRep cooledrinkRep=null;
    private CooledrinkRep() {
    }
public static CooledrinkRep getCooledrinkRep(){
        if(cooledrinkRep==null){
            cooledrinkRep=new CooledrinkRep();
        }return cooledrinkRep;
}

    @Override
    public CoolDrink create(CoolDrink coolDrink) {
        return null;
    }

    @Override
    public CoolDrink update(CoolDrink coolDrink) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public CoolDrink read(String s) {
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
