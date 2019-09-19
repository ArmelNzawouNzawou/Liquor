package factory.repository.item.impl.impl;

import domain.item.Item;
import repository.Irepository;
import repository.item.impl.impl.ItemRep;

import java.util.ArrayList;

public class ItemRepFactory{
public static ItemRep getItemRep(){
    return ItemRep.getItemRep();
}
}