package company.com.factory.services.impl.impl;

import company.com.service.item.impl.impl.ItemService;

public class ItemServiceFactory{
public static ItemService getItemRep(){
    return ItemService.getItemRep();
}
}