package company.com.factory.repository;

import company.com.repository.ItemTrensaction.ItemStockRep;

public class ItemStockRepFactory {
    public static ItemStockRep getItemStockRep(){
        return ItemStockRep.getItemStockRep();
    }
}
