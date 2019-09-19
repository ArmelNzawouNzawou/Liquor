package factory.repository.item.impl.impl;

import domain.item.impl.beverage.nonalcohol.NonAlcohol;
import repository.Irepository;
import repository.item.impl.impl.NonAlcholRep;

import java.util.ArrayList;

public class NonAlcholRepFactory {

    public static NonAlcholRep getNonAlcholRep(){
        return NonAlcholRep.getNonAlcholRep();
    }
}