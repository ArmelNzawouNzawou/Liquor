package service.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;
import factory.domain.item.impl.beverage.nonalcohol.impl.EnergyDrinkFactory;
import factory.repository.item.impl.beverage.nonalcohol.impl.EnergyDrinkRepFactory;
import repository.item.impl.beverage.nonalcohol.impl.EnergyDrinkRep;
import service.item.impl.beverage.nonalcohol.EnergyDrinkInt;

import java.util.ArrayList;

public class EnergyDrinkService implements EnergyDrinkInt {

    private static EnergyDrinkService energyDrinkRep=null;
    private EnergyDrinkRep energyDrink= EnergyDrinkRepFactory.getEnergyDrinkRep();

    private EnergyDrinkService() {
    }
public static EnergyDrinkService getEnergyDrinkRep(){
        if(energyDrinkRep==null){
            energyDrinkRep=new EnergyDrinkService();
        }return energyDrinkRep;
}


    @Override
    public EnergyDrink create(EnergyDrink energyDrink) {
        return this.energyDrink.create(energyDrink);
    }

    @Override
    public EnergyDrink update(EnergyDrink energyDrink) {
        return this.energyDrink.update(energyDrink);
    }

    @Override
    public void delete(String id) {
        energyDrink.delete(id);
    }

    @Override
    public EnergyDrink read(String id) {
        return energyDrink.read(id);
    }

    @Override
    public ArrayList<EnergyDrink> readAlll() {
        return energyDrink.readAll();
    }
}
