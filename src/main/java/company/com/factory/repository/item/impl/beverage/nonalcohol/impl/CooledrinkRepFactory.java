package company.com.factory.repository.item.impl.beverage.nonalcohol.impl;

import company.com.repository.item.impl.beverage.nonalcohol.impl.CooledrinkRep;

public class CooledrinkRepFactory{
    public static CooledrinkRep getCooledrinkRep(){
        return CooledrinkRep.getCooledrinkRep();
    }
}