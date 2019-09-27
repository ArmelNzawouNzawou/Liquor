package company.com.factory.repository.item.impl.beverage.beverage_Bridge;

import company.com.repository.item.impl.beverage.beverage_Bridge.impl.Beverage_NonalcoholRep;

public class Beverage_NonalcolicRapFactory {
    public static Beverage_NonalcoholRep getBeverage(){
        return Beverage_NonalcoholRep.getBeverage_alcoholServ();
    }
}
