package company.com.factory.services.impl.beverage.alcohol.impl;

import company.com.service.item.impl.beverage.alcohol.impl.VineService;

public class VineServiceFactory{
    public static VineService getVineRep(){
        return VineService.getVine();
    }
}