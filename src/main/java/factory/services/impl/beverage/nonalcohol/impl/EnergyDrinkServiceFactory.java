package factory.services.impl.beverage.nonalcohol.impl;

import repository.item.impl.beverage.nonalcohol.impl.EnergyDrinkRep;
import service.item.impl.beverage.nonalcohol.impl.EnergyDrinkService;

public class EnergyDrinkServiceFactory{
public static EnergyDrinkService getEnergyDrinkRep(){
    return EnergyDrinkService.getEnergyDrinkRep();
}
}