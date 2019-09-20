package factory.domain.item.impl.beverage.nonalcohol.impl;


import domain.item.impl.beverage.nonalcohol.impl.CoolDrink;

public class CoolDrinkFactory {
    public static CoolDrink getCooledrink(String id, String name){
        return new CoolDrink.Builder(id).buildName(name).build();
    }
}
