package company.com.factory.repository.item.impl.impl;

import company.com.repository.item.impl.impl.ItemRep;

public class ItemRepFactory{
public static ItemRep getItemRep(){
    return ItemRep.getItemRep();
}
}