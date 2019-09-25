package factory.domain.item.impl.beverage.nonalcohol.nonalcohol_bridge;

import domain.item.impl.beverage.beverage_Bridge.Beverage_NonAlcohol;
import domain.item.impl.beverage.nonalcohol.nonalcoholBridge.NonAlcoholItem;

//a bridge class between beverage and all the NonAlcohole Item
public class NonAlcohol_Item {
    public static NonAlcoholItem getNonAlcoholItem(String id,String item_id, String nonAlcohol_id,String description){
        return new NonAlcoholItem.Builder(id)
                .buildAlcoholId(nonAlcohol_id)
                .buildDescription(description)
                .buildItem_id(item_id)
                .build();

    }
}
