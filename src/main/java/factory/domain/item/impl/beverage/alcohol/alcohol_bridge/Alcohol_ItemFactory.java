package factory.domain.item.impl.beverage.alcohol.alcohol_bridge;

import domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import util.IdGenerator;

public class Alcohol_ItemFactory {
    public static AlcoholItem getAlcoholItem(String item_id, String alcohol_id,String description){
        return new AlcoholItem.Builder(IdGenerator.getSuffixFromClassName(AlcoholItem.class))
                .buildAlcoholId(alcohol_id)
                .buildDescription(description)
                .buildItem_id(item_id)
                .build();

    }
}
