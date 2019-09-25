package factory.services.impl.beverage.nonalcohol.impl;

import repository.item.impl.beverage.nonalcohol.impl.CooledrinkRep;
import service.item.impl.beverage.nonalcohol.impl.CooledrinkService;

public class CooledrinkServiceFactory{
    public static CooledrinkService getCooledrinkRep(){
        return CooledrinkService.getCooledrinkRep();
    }
}