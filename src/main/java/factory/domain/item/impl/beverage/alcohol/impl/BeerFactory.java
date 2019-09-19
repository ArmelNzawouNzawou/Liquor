package factory.domain.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Beer;

public class BeerFactory {

public static Beer getBeer(String id, String name){
    return new Beer.Builder(id).buildName(name).build();
}
}
