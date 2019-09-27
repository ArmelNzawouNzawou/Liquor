package company.com.controller.item.itemBridge;

import company.com.domain.item.impl.ItemBridge.Item_Classic;

public class Item_ClassicFactory {
    public static Item_Classic getItem_Classic(String id,String item_id,String classic_id,String description){
        return new Item_Classic.Builder(id)
                .buildClassicId(description)
                .buildItemId(item_id)
                .buildClassicId(classic_id)
                .build();
    }
}
