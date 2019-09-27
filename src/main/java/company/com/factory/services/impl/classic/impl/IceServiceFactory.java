package company.com.factory.services.impl.classic.impl;

import company.com.service.item.impl.classic.impl.IceService;

public class IceServiceFactory{
    public static IceService getIceRep(){
        return IceService.getIceRep();
    }
}