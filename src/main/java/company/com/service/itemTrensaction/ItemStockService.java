package company.com.service.itemTrensaction;

import company.com.domain.itemTrensaction.ItemStock;
import company.com.factory.repository.ItemStockRepFactory;
import company.com.repository.ItemTrensaction.ItemStockRep;
import company.com.service.Iservice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class ItemStockService implements Iservice<ItemStock,String> {
    ItemStockRep itemStockRep= ItemStockRepFactory.getItemStockRep();
    @Override
    public ItemStock create(ItemStock itemStock) {
        return itemStockRep.create(itemStock);
    }
    @Override
    public ItemStock update(ItemStock itemStock) {
        return itemStockRep.update(itemStock);
    }

    @Override
    public void delete(String id) {
        itemStockRep.delete(id);
    }

    @Override
    public ItemStock read(String id) {
        return itemStockRep.read(id);
    }

    @Override
    public ArrayList<ItemStock> readAlll() {
        return itemStockRep.readAll();
    }
    public void sellItem(String itemId,int number){
        itemStockRep.sellItem(itemId,number);
    }
}
