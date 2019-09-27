package company.com.controller.item.itemBridge;

import company.com.controller.ControllerInt;
import company.com.domain.item.impl.ItemBridge.Item_beverage;

import java.util.ArrayList;

public class Item_beverageController implements ControllerInt<Item_beverage,String> {

    @Override
    public Item_beverage create(Item_beverage item_beverage) {
        return null;
    }

    @Override
    public Item_beverage read(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Item_beverage update(Item_beverage item_beverage) {
        return null;
    }

    @Override
    public ArrayList<Item_beverage> readAll() {
        return null;
    }
}
