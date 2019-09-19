package repository.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;
import repository.item.impl.beverage.nonalcohol.EnergyDrinkInt;

import java.util.ArrayList;

public class EnergyDrinkRep implements EnergyDrinkInt {

    private static EnergyDrinkRep energyDrinkRep=null;

    private EnergyDrinkRep() {
    }
public static EnergyDrinkRep getEnergyDrinkRep(){
        if(energyDrinkRep==null){
            energyDrinkRep=new EnergyDrinkRep();
        }return energyDrinkRep;
}

    @Override
    public EnergyDrink create(EnergyDrink energyDrink) {
        return null;
    }

    @Override
    public EnergyDrink update(EnergyDrink energyDrink) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public EnergyDrink read(String s) {
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
