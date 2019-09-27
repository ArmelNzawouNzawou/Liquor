package company.com.factory.domain.item.impl.beverage.beverage_Bridge;
import company.com.domain.item.impl.beverage.beverage_Bridge.Beverage_NonAlcohol;
import company.com.util.IdGenerator;

public class Beverage_NonalcolicFactory {
    public static Beverage_NonAlcohol getBeverage(String item_id,String nonAlcohol_id,String description){
        return new Beverage_NonAlcohol.Builder(IdGenerator.getSuffixFromClassName(Beverage_NonAlcohol.class))
                .buildItem_id(item_id)
                .buildDescription(description)
                .buildNonAlcoholId(nonAlcohol_id)
                .build();
    }
    public static Beverage_NonAlcohol updateBeverage(String id,String item_id,String nonAlcohol_id,String description){
        return new Beverage_NonAlcohol.Builder(id)
                .buildItem_id(item_id)
                .buildDescription(description)
                .buildNonAlcoholId(nonAlcohol_id)
                .build();
    }
}
