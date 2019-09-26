package factory.domain.item.impl.classic.classic_item;

import domain.item.impl.classic.classicBridge.ClassicItem;
import util.IdGenerator;

public class Classic_ItemFactory {
    public static ClassicItem getClassicItem( String item_Name, String classic_id, String description){
        return new ClassicItem.Builder(IdGenerator.getSuffixFromClassName(ClassicItem.class))
                .buildClassicId(classic_id)
                .buildDescription(description)
                .buildItem_Name(item_Name)
                .build();
    }
    public static ClassicItem updateClassicItem(String id, String item_Name, String classic_id, String description){
        return new ClassicItem.Builder(id)
                .buildClassicId(classic_id)
                .buildDescription(description)
                .buildItem_Name(item_Name)
                .build();
    }
}
