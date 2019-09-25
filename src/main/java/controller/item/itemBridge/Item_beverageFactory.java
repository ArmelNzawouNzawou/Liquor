package controller.item.itemBridge;

import domain.item.impl.ItemBridge.Item_beverage;

public class Item_beverageFactory {
    public static Item_beverage getItem_beveradge(String id,String item_id, String beverage_id,String description){
        return new Item_beverage.Builder(id)
                .buildItemId(item_id)
                .buildDescription(description)
                .buildBeverage(beverage_id)
                .build();
    }
}
