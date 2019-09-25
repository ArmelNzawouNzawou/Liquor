package factory.services.impl.impl;

import repository.item.impl.impl.NonAlcholRep;
import service.item.impl.impl.NonAlcholService;

public class NonAlcholServiceFactory {

    public static NonAlcholService getNonAlcholRep(){
        return NonAlcholService.getNonAlcholRep();
    }
}