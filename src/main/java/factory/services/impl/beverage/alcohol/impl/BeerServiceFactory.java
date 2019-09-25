package factory.services.impl.beverage.alcohol.impl;

import repository.item.impl.beverage.alcohol.impl.BeerRep;
import service.item.impl.beverage.alcohol.impl.BeerService;

public class BeerServiceFactory{
public static BeerService getBeerRep(){
    return BeerService.getBeerRep();
}
}