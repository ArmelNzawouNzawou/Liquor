package factory.services.impl.impl;

import repository.item.impl.impl.AlcoholRep;
import service.item.impl.impl.AlcoholService;

public class AlcoholServiceFactory{
public static AlcoholService getAlcoholRep(){
    return AlcoholService.getAlcoholRep();
}
}