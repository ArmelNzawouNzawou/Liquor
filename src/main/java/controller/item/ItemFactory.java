package controller.item;


import domain.item.Item;

public class ItemFactory {
   public static Item getItem(String itemNumber, String itemBranch){
       return new Item.Builder(itemNumber)
               .buildItemBranch(itemBranch)
               .build();
   }
}
