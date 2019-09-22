package service.item.impl.impl;

import domain.item.Item;
import factory.repository.item.impl.impl.ItemRepFactory;
import repository.item.impl.impl.ItemRep;
import service.item.ItemInt;

import java.util.ArrayList;

public class ItemService implements ItemInt {
    private static ItemService itemRep=null;
    private ItemRep itemR= ItemRepFactory.getItemRep();

    private ItemService() {
    }
    public static ItemService getItemRep(){
        if(itemRep==null){
            itemRep=new ItemService();
        }return itemRep;
    }


    @Override
    public Item create(Item item) {
        return itemR.create(item);
    }

    @Override
    public Item update(Item item) {
        return itemR.update(item);
    }

    @Override
    public void delete(String id) {
        itemR.delete(id);
    }

    @Override
    public Item read(String id) {
        return itemR.read(id);
    }

    @Override
    public ArrayList<Item> readAlll() {
        return itemR.readAll();
    }
}
