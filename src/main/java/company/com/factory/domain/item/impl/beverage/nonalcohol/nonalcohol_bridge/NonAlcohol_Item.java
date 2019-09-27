package company.com.factory.domain.item.impl.beverage.nonalcohol.nonalcohol_bridge;

import company.com.domain.item.impl.beverage.nonalcohol.nonalcoholBridge.NonAlcoholItem;

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
