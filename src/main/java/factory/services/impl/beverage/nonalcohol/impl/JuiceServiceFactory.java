package factory.services.impl.beverage.nonalcohol.impl;

import repository.item.impl.beverage.nonalcohol.impl.JuiceRep;
import service.item.impl.beverage.nonalcohol.impl.JuiceService;

public class JuiceServiceFactory{
public static JuiceService getJuiceRep(){
    return JuiceService.getJuiceRep();
}
}