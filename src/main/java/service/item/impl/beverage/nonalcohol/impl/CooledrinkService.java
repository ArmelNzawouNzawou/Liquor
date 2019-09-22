package service.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.CoolDrink;
import factory.domain.item.impl.beverage.nonalcohol.impl.CoolDrinkFactory;
import factory.repository.item.impl.beverage.nonalcohol.impl.CooledrinkRepFactory;
import repository.item.impl.beverage.nonalcohol.impl.CooledrinkRep;
import service.item.impl.beverage.nonalcohol.CooledrinkInt;

import java.util.ArrayList;

public class CooledrinkService implements CooledrinkInt {
private static CooledrinkService cooledrinkRep=null;
private CooledrinkRep cooledrink= CooledrinkRepFactory.getCooledrinkRep();
    private CooledrinkService() {
    }
public static CooledrinkService getCooledrinkRep(){
        if(cooledrinkRep==null){
            cooledrinkRep=new CooledrinkService();
        }return cooledrinkRep;
}


    @Override
    public CoolDrink create(CoolDrink coolDrink) {
        return cooledrink.create(coolDrink);
    }

    @Override
    public CoolDrink update(CoolDrink coolDrink) {
        return cooledrink.update(coolDrink);
    }

    @Override
    public void delete(String id) {
        cooledrink.delete(id);
    }

    @Override
    public CoolDrink read(String id) {
        return cooledrink.read(id);
    }

    @Override
    public ArrayList<CoolDrink> readAlll() {
        return cooledrink.readAll();
    }
}
