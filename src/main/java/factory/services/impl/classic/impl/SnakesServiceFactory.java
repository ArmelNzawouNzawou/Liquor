package factory.services.impl.classic.impl;

import repository.item.impl.classic.impl.SnakesRep;
import service.item.impl.classic.impl.SnakesService;

public class SnakesServiceFactory{
    public static SnakesService getSnakesRep(){
        return SnakesService.getsnakesRep();
    }

}