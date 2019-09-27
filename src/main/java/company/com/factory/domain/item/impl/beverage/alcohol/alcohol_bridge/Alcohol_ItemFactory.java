package company.com.factory.domain.item.impl.beverage.alcohol.alcohol_bridge;

import company.com.domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import company.com.util.IdGenerator;

public class Alcohol_ItemFactory {
    public static AlcoholItem getAlcoholItem(String item_id, String Beverage_id,String description){
        return new AlcoholItem.Builder(IdGenerator.getSuffixFromClassName(AlcoholItem.class))
                .buildBeverage_id(Beverage_id)
                .buildDescription(description)
                .buildItem_id(item_id)
                .build();

    }
    public static AlcoholItem updateAlcoholItem(String id,String item_id, String Beverage_id,String description){
        return new AlcoholItem.Builder(id)
                .buildBeverage_id(Beverage_id)
                .buildDescription(description)
                .buildItem_id(item_id)
                .build();

    }
}
