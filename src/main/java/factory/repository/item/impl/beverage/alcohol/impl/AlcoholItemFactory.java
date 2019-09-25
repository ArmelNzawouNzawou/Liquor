package factory.repository.item.impl.beverage.alcohol.impl;

import repository.item.impl.beverage.alcohol.alcoholBridge.AlcoholItemRepository;

public class AlcoholItemFactory {
    public static AlcoholItemRepository getAlcoholItem(){
        return AlcoholItemRepository.getAlco();
    }
}
