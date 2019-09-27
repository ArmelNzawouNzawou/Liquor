package company.com.factory.repository.item.impl.beverage.alcohol.impl;

import company.com.repository.item.impl.beverage.alcohol.impl.VineRep;

public class VineRepFactory{
    public static VineRep getVineRep(){
        return VineRep.getVine();
    }
}