package factory.services.impl.classic.impl;

import repository.item.impl.classic.impl.IceRep;
import service.item.impl.classic.impl.IceService;

public class IceServiceFactory{
    public static IceService getIceRep(){
        return IceService.getIceRep();
    }
}