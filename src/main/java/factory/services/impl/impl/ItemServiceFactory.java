package factory.services.impl.impl;

import repository.item.impl.impl.ItemRep;
import service.item.impl.impl.ItemService;

public class ItemServiceFactory{
public static ItemService getItemRep(){
    return ItemService.getItemRep();
}
}