package repository.item.impl.beverage.beverage_Bridge.impl;

import domain.item.impl.ItemBridge.Item_beverage;
import factory.domain.item.itemBridge.Item_beverageFactory;
import repository.item.impl.beverage.beverage_Bridge.Beverage_ItemInt;

import java.util.ArrayList;

public class Item_BeverageRepo implements Beverage_ItemInt {
    public static Item_BeverageRepo item_beverageRepo;
    private ArrayList<Item_beverage>mydb=new ArrayList<>();

    private Item_BeverageRepo() {
    }
    public static Item_BeverageRepo getItem_BeverageRepo(){
        if(item_beverageRepo==null){
            item_beverageRepo=new Item_BeverageRepo();
        }return item_beverageRepo;
    }

    @Override
    public Item_beverage create(Item_beverage item) {
        Item_beverage result=findItemb(item.getId());
        if(result==null){
            Item_beverage result1= Item_beverageFactory.getItem_beveradge(item.getItem_Branch(),item.getBeverage_id(),item.getDescription());
            mydb.add(result1);
            return result1;
        }
        return null;
    }

    @Override
    public Item_beverage update(Item_beverage item) {
        Item_beverage result=findItemb(item.getId());
        if(result!=null){
            Item_beverage result1= Item_beverageFactory.updateItem_beveradge(item.getId(),item.getItem_Branch(),item.getBeverage_id(),item.getDescription());
            return result1;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Item_beverage result=findItemb(s);
        if(result!=null){
            mydb.remove(result);
        }

    }

    @Override
    public Item_beverage read(String s) {
        Item_beverage result=findItemb(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Item_beverage> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Item_beverage findItemb(String id){
        return mydb.stream()
                .filter(B -> B.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
