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
        Item result = findAlcohol(item.getItemNumber());
        if(result==null){
            mydb.add(item);
            return item;
        }
        return null;
    }

    @Override
    public Item update(Item item) {
        
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Item read(String s) {
        return null;
    }

    @Override
    public ArrayList<Item> readAll() {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Item findAlcohol(String id){
        return mydb.stream()
                .filter(C ->C.getItemNumber().equals(id))
                .findAny()
                .orElse(null);
    }
}
