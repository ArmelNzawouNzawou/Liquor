package factory.repository.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Whisky;
import repository.Irepository;
import repository.item.impl.beverage.alcohol.impl.WhiskyRep;

import java.util.ArrayList;

public class WhiskyRepFactory{
public static WhiskyRep getWhiskyRep(){
    return WhiskyRep.getWhiskyRep();
}
}