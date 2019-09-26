package factory.domain.item.itemBridge;

import domain.item.impl.ItemBridge.Item_beverage;
import util.IdGenerator;

public class Item_beverageFactory {
    public static Item_beverage getItem_beveradge(String item_Name, String beverage_id,String description){
        return new Item_beverage.Builder(IdGenerator.getSuffixFromClassName(Item_beverage.class))
                .buildItem_Branch(item_Name)
                .buildDescription(description)
                .buildBeverage(beverage_id)
                .build();
    }
    public static Item_beverage updateItem_beveradge(String id,String item_Name, String beverage_id,String description){
        return new Item_beverage.Builder(id)
                .buildItem_Branch(item_Name)
                .buildDescription(description)
                .buildBeverage(beverage_id)
                .build();
    }
}
