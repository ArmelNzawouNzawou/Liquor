package company.com.service.item.impl.impl;

import company.com.domain.item.Item;
import company.com.factory.repository.item.impl.impl.ItemRepFactory;
import org.springframework.stereotype.Component;
import company.com.repository.item.impl.impl.ItemRep;
import company.com.service.item.ItemInt;

import java.util.ArrayList;
@Component
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
    public Item getItem(String itemName){
        return itemR.getItem(itemName);
    }
}
