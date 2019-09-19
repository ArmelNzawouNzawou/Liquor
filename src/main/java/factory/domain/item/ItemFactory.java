package factory.domain.item;

import com.domain.item.Item;

public class ItemFactory {
   public static Item getItem(String itemNumber, String itemBranch, String itemPrice){
       return new Item.Builder(itemNumber)
               .buildItemBranch(itemBranch)
               .buildItemPrice(itemPrice)
               .build();
   }
}
