package factory.services.impl.beverage.alcohol.impl;

import repository.item.impl.beverage.alcohol.impl.WhiskyRep;
import service.item.impl.beverage.alcohol.impl.WhiskyService;

public class WhiskyServiceFactory{
public static WhiskyService getWhiskyRep(){
    return WhiskyService.getWhiskyRep();
}
}