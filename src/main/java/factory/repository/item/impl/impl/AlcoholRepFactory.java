package factory.repository.item.impl.impl;

import domain.item.impl.beverage.alcohol.Alcohol;
import repository.Irepository;
import repository.item.impl.impl.AlcoholRep;

import java.util.ArrayList;

public class AlcoholRepFactory{
public static AlcoholRep getAlcoholRep(){
    return AlcoholRep.getAlcoholRep();
}
}