package company.com.factory.repository.item.impl.beverage.alcohol.impl;

import company.com.repository.item.impl.beverage.alcohol.impl.BeerRep;

public class BeerRepFactory{
public static BeerRep getBeerRep(){
    return BeerRep.getBeerRep();
}
}