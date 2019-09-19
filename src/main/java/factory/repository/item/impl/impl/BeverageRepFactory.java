package factory.repository.item.impl.impl;

import domain.item.impl.beverage.Beverage;
import repository.Irepository;
import repository.item.impl.impl.BeverageRep;

import java.util.ArrayList;

public class BeverageRepFactory{
public static BeverageRep getBeverageRep(){
    return BeverageRep.getBeverageRep();
}
}