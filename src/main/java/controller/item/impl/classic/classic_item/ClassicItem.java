package controller.item.impl.classic.classic_item;

import domain.item.impl.classic.classicBridge.ClassicItem;

public class Classic_ItemFactory {
    public static ClassicItem getClassicItem(String id, String item_id, String classic_id, String description){
        return new ClassicItem.Builder(id)
                .buildClassicId(classic_id)
                .buildDescription(description)
                .buildItem_id(item_id)
                .build();
    }
}
