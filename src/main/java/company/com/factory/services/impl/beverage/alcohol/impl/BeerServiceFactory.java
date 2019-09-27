package company.com.factory.services.impl.beverage.alcohol.impl;

import company.com.service.item.impl.beverage.alcohol.impl.BeerService;

public class BeerServiceFactory{
public static BeerService getBeerRep(){
    return BeerService.getBeerRep();
}
}