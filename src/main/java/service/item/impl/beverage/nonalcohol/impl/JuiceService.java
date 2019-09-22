package service.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.Juice;
import factory.repository.item.impl.beverage.nonalcohol.impl.JuiceRepFactory;
import repository.item.impl.beverage.nonalcohol.impl.JuiceRep;
import service.item.impl.beverage.nonalcohol.JuiceInt;

import java.util.ArrayList;

public class JuiceService implements JuiceInt {
    private static JuiceService juiceRep=null;
    private JuiceRep juice= JuiceRepFactory.getJuiceRep();

    private JuiceService() {
    }
    public static JuiceService getJuiceRep(){
        if(juiceRep==null){
            juiceRep=new JuiceService();
        }return juiceRep;
    }


    @Override
    public Juice create(Juice juice) {
        return this.juice.create(juice);
    }

    @Override
    public Juice update(Juice juice) {
        return this.juice.update(juice);
    }

    @Override
    public void delete(String id) {
        juice.delete(id);
    }

    @Override
    public Juice read(String id) {
        return juice.read(id);
    }

    @Override
    public ArrayList<Juice> readAlll() {
        return juice.readAll();
    }
}
