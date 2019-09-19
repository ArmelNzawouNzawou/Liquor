package factory.repository.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.CoolDrink;
import repository.Irepository;
import repository.item.impl.beverage.nonalcohol.impl.CooledrinkRep;

import java.util.ArrayList;

public class CooledrinkRepFactory{
    public static CooledrinkRep getCooledrinkRep(){
        return CooledrinkRep.getCooledrinkRep();
    }
}