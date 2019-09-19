package factory.repository.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Vine;
import repository.Irepository;
import repository.item.impl.beverage.alcohol.impl.VineRep;

import java.util.ArrayList;

public class VineRepFactory{
    public static VineRep getVineRep(){
        return VineRep.getVine();
    }
}