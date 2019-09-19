package factory.repository.item.impl.beverage.nonalcohol.impl;

import domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;
import repository.Irepository;
import repository.item.impl.beverage.nonalcohol.impl.EnergyDrinkRep;

import java.util.ArrayList;

public class EnergyDrinkRepFactory{
public static EnergyDrinkRep getEnergyDrinkRep(){
    return EnergyDrinkRep.getEnergyDrinkRep();
}
}