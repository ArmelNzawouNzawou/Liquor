package factory.services.impl.classic.impl;

import repository.item.impl.classic.impl.CigarateRep;
import service.item.impl.classic.impl.CigarateService;

public class CigarateServiceFactory{
public static CigarateService getCigarateRep(){
    return CigarateService.getCigarateRep();
}
}