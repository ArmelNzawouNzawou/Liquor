package factory.services.impl.impl;

import repository.item.impl.impl.BeverageRep;
import service.item.impl.impl.BeverageService;

public class BeverageServiceFactory{
public static BeverageService getBeverageRep(){
    return BeverageService.getBeverageRep();
}
}