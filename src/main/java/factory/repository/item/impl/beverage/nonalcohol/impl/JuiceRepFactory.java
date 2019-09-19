package factory.repository.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.Juice;
import repository.Irepository;
import repository.item.impl.beverage.nonalcohol.impl.JuiceRep;

import java.util.ArrayList;

public class JuiceRepFactory{
public static JuiceRep getJuiceRep(){
    return JuiceRep.getJuiceRep();
}
}