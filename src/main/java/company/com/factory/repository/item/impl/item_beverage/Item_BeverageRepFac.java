package company.com.factory.repository.item.impl.item_beverage;

import company.com.repository.item.impl.beverage.beverage_Bridge.impl.Item_BeverageRepo;

public class Item_BeverageRepFac {
    public static Item_BeverageRepo getItemBeverageRepo(){
        return Item_BeverageRepo.getItem_BeverageRepo();
    }
}
