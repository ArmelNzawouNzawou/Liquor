package factory.domain.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Beer;
import util.IdGenerator;

public class BeerFactory {

public static Beer getBeer( String name,String size,double price){
    return new Beer.Builder(IdGenerator.getSuffixFromClassName(Beer.class))
            .buildPrice(price)
            .buildSize(size)
            .buildName(name)
            .build();
}
}
