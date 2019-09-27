package company.com.factory.domain.item.impl.beverage.nonalcohol.impl;


import company.com.domain.item.impl.beverage.nonalcohol.impl.CoolDrink;

public class CoolDrinkFactory {
    public static CoolDrink getCooledrink(String id, String name){
        return new CoolDrink.Builder(id).buildName(name).build();
    }
}
