package factory.services.impl.impl;

import repository.item.impl.impl.ClassicRep;
import service.item.impl.impl.ClassicService;

public class ClassicServiceFactory{
public static ClassicService getClassicRep(){
    return ClassicService.getClassicRep();
}
}