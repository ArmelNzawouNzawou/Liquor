package factory.domain.item.impl.beverage.beverage_Bridge;

import domain.item.impl.beverage.beverage_Bridge.Beverage_Alcohol;
import util.IdGenerator;

//a bridge class between beverage and all the Alcohole Item
public class Beverage_AlcoholFactory {
    public static Beverage_Alcohol getAlcoholItem(String item_id, String alcohol_id, String description){
        return new Beverage_Alcohol.Builder(IdGenerator.getSuffixFromClassName(Beverage_Alcohol.class))
                .buildBeverageId(alcohol_id)
                .buildItem_id(item_id)
                .buildDescription(description)
                .build();
    }
    public static Beverage_Alcohol updateAlcoholItem(String id, String item_id, String alcohol_id, String description){
        return new Beverage_Alcohol.Builder(id)
                .buildBeverageId(alcohol_id)
                .buildItem_id(item_id)
                .buildDescription(description)
                .build();
    }
}
