package controller.item.itemBridge;

import controller.ControllerInt;
import domain.item.impl.ItemBridge.Item_beverage;
import org.springframework.beans.factory.annotation.Autowired;
import service.item.impl.beverage.beverage_Bridge.impl.Item_BeverageServ;

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
