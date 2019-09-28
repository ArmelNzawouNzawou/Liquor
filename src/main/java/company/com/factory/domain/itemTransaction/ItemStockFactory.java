package company.com.factory.domain.itemTransaction;

import company.com.domain.itemTrensaction.ItemStock;
import company.com.util.IdGenerator;

public class ItemStockFactory {
    public static ItemStock getItemStock(String itemId,double itemPrice,int quantity,String descrption){
        return new ItemStock.Builder(IdGenerator.getSuffixFromClassName(ItemStock.class))
                .buildItemId(itemId)
                .buildItemPrice(itemPrice)
                .buildQuantity(quantity)
                .buildDescription(descrption)
                .build();
    }
    public static ItemStock updateItemStock(String itemstockid,String itemId,double itemPrice,int quantity,String descrption){
        return new ItemStock.Builder(itemstockid)
                .buildItemId(itemId)
                .buildItemPrice(itemPrice)
                .buildQuantity(quantity)
                .buildDescription(descrption)
                .build();
    }
}
