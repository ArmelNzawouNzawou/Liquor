package repository.item.impl.impl;

import domain.item.Item;
import repository.item.ItemInt;

import java.util.ArrayList;

public class ItemRep implements ItemInt {
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
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
