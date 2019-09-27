package company.com.factory.domain.item.impl.beverage.beverage_Bridge;

import company.com.domain.item.impl.ItemBridge.Item_beverage;
import company.com.util.IdGenerator;

public class Item_BeverageFactory {
    public static Item_beverage getItem_beverage(String item_Branch,String classic_id,String description){
        return new Item_beverage.Builder(IdGenerator.getSuffixFromClassName(Item_beverage.class))
                .buildBeverage(classic_id)
                .buildDescription(description)
                .buildItem_Branch(item_Branch)
                .build();
    }
    public static Item_beverage updateItem_beverage(String id,String item_Branch,String classic_id,String description){
        return new Item_beverage.Builder(id)
                .buildBeverage(classic_id)
                .buildDescription(description)
                .buildItem_Branch(item_Branch)
                .build();
    }
}
