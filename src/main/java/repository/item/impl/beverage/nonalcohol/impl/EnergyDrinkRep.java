package repository.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;
import repository.item.impl.beverage.nonalcohol.EnergyDrinkInt;

import java.util.ArrayList;

public class EnergyDrinkRep implements EnergyDrinkInt {

    private static EnergyDrinkRep energyDrinkRep=null;
    private ArrayList<EnergyDrink>mydb=new ArrayList<>();

    private EnergyDrinkRep() {
    }
public static EnergyDrinkRep getEnergyDrinkRep(){
        if(energyDrinkRep==null){
            energyDrinkRep=new EnergyDrinkRep();
        }return energyDrinkRep;
}

    @Override
    public EnergyDrink create(EnergyDrink energyDrink) {
        EnergyDrink result=findEnergyDrink(energyDrink.getId());
        if(result==null){
            mydb.add(energyDrink);
            return energyDrink;
        }
        return null;
    }

    @Override
    public EnergyDrink update(EnergyDrink energyDrink) {
        EnergyDrink result=findEnergyDrink(energyDrink.getId());
        if(result!=null){
            delete(result.getId());
            return create(energyDrink);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        EnergyDrink result=findEnergyDrink(s);
        if(result!=null){
            mydb.remove(result);

        }
    }

    @Override
    public EnergyDrink read(String s) {
        EnergyDrink result=findEnergyDrink(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<EnergyDrink> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public EnergyDrink findEnergyDrink(String id){
        return mydb.stream().filter(E ->E.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
