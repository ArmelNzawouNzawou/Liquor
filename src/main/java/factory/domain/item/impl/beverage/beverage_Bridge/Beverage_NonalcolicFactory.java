package factory.domain.item.impl.beverage.beverage_Bridge;
import domain.item.impl.beverage.beverage_Bridge.Beverage_NonAlcohol;
import repository.item.impl.beverage.beverage_Bridge.impl.Beverage_NonalcoholRep;
import util.IdGenerator;

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
