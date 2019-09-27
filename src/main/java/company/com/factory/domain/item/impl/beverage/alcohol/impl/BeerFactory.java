package company.com.factory.domain.item.impl.beverage.alcohol.impl;

import company.com.domain.item.impl.beverage.alcohol.impl.Beer;
import company.com.util.IdGenerator;

public class BeerFactory {

public static Beer getBeer( String name,String size,double price,int quantity){
    return new Beer.Builder(IdGenerator.getSuffixFromClassName(Beer.class))
            .buildPrice(price)
            .buildQuantity(quantity)
            .buildSize(size)
            .buildName(name)
            .build();
}
}
