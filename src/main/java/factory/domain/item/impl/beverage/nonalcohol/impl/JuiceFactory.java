package factory.domain.item.impl.beverage.nonalcohol.impl;


import domain.item.impl.beverage.nonalcohol.impl.Juice;

public class JuiceFactory {
    public static Juice getJuice(String id, String name){
        return new Juice.Builder(id).buildName(name).build();
    }
}
