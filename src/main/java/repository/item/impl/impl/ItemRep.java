package repository.item.impl.impl;

import domain.item.Item;
import repository.item.ItemInt;

import java.util.ArrayList;

public class ItemRep implements ItemInt {
    private ArrayList<Item>mydb =new ArrayList<>();
    private static ItemRep itemRep=null;

    private ItemRep() {
    }
    public static ItemRep getItemRep(){
        if(itemRep==null){
            itemRep=new ItemRep();
        }return itemRep;
    }

    @Override
    public Item create(Item item) {
        Item result = findAlcohol(item.getItemNamer());
        if(result==null){
            mydb.add(item);
            return item;
        }
        return null;
    }

    @Override
    public Item update(Item item) {
        Item result = findAlcohol(item.getItemNamer());
        if(result!=null){
            delete(result.getItemNamer());
            return create(item);
        }
        return null;
    }

    @Override
    public void delete(String s) {

        Item result = findAlcohol(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public Item read(String s) {
        Item result = findAlcohol(s);
        if(result!=null){

            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Item> readAll() {
        return mydb;
    }
    public Item getItem(String itemName){
        return mydb.stream()
                .filter(I ->I.getItemNamer().equalsIgnoreCase(itemName))
                .findAny()
                .orElse(null);
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Item findAlcohol(String id){
        return mydb.stream()
                .filter(C ->C.getItemNamer().equals(id))
                .findAny()
                .orElse(null);
    }
}
