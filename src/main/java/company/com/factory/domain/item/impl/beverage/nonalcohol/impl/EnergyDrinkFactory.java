package company.com.factory.domain.item.impl.beverage.nonalcohol.impl;


import company.com.domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;

public class EnergyDrinkFactory {
    public static EnergyDrink getEnergyDrink(String id, String name){
        return new EnergyDrink.Builder(id).buildName(name).build();
    }
}
