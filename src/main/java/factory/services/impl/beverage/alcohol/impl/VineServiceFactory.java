package factory.services.impl.beverage.alcohol.impl;

import repository.item.impl.beverage.alcohol.impl.VineRep;
import service.item.impl.beverage.alcohol.impl.VineService;

public class VineServiceFactory{
    public static VineService getVineRep(){
        return VineService.getVine();
    }
}