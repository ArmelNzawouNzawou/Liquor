package factory.repository.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Beer;
import repository.Irepository;
import repository.item.impl.beverage.alcohol.impl.BeerRep;

import java.util.ArrayList;

public class BeerRepFactory{
public static BeerRep getBeerRep(){
    return BeerRep.getBeerRep();
}
}