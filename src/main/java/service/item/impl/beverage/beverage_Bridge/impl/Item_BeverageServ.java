package service.item.impl.beverage.beverage_Bridge.impl;

import domain.item.impl.ItemBridge.Item_beverage;
import factory.domain.item.itemBridge.Item_beverageFactory;
import factory.repository.item.impl.item_beverage.Item_BeverageRepFac;
import repository.item.impl.beverage.beverage_Bridge.impl.Item_BeverageRepo;
import service.item.impl.beverage.beverage_Bridge.Beverage_ItemInt;

import java.util.ArrayList;

public class Item_BeverageServ implements Beverage_ItemInt {
    public static Item_BeverageServ item_beverageRepo;
    private ArrayList<Item_beverage>mydb=new ArrayList<>();
    private Item_BeverageRepo IBR= Item_BeverageRepFac.getItemBeverageRepo();

    private Item_BeverageServ() {
    }
    public static Item_BeverageServ getItem_BeverageRepo(){
        if(item_beverageRepo==null){
            item_beverageRepo=new Item_BeverageServ();
        }return item_beverageRepo;
    }


    @Override
    public Item_beverage create(Item_beverage item_beverage) {
        return IBR.create(item_beverage);
    }

    @Override
    public Item_beverage update(Item_beverage item_beverage) {
        return IBR.update(item_beverage);
    }

    @Override
    public void delete(String id) {
        IBR.delete(id);
    }

    @Override
    public Item_beverage read(String id) {
        return IBR.read(id);
    }

    @Override
    public ArrayList<Item_beverage> readAlll() {
        return IBR.readAll();
    }
}
