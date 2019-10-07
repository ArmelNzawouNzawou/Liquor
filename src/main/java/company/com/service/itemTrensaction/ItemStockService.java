package company.com.service.itemTrensaction;

import company.com.domain.itemTrensaction.ItemStock;
import company.com.factory.repository.ItemStockRepFactory;
import company.com.repository.ItemTrensaction.ItemStockRepInt;
import company.com.repository.ItemTrensaction.impl.ItemStockRep;
import company.com.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ItemStockService implements Iservice<ItemStock,String> {
    @Autowired
    ItemStockRep itemStockRep;
    private static ItemStockService itemStockService;
    private ItemStockService(){}
    public static ItemStockService getItemStockService(){
        if(itemStockService==null){
            itemStockService=new ItemStockService();
        }return itemStockService;
    }
    @Override
    public ItemStock create(ItemStock itemStock) {
        return itemStockRep.save(itemStock);
    }
    @Override
    public ItemStock update(ItemStock itemStock) {
        Optional<ItemStock>result=itemStockRep.findById(itemStock.getStockId());
        if(result!=null){
            delete(itemStock.getStockId());
            result.orElse(null);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        itemStockRep.deleteById(id);
    }

    @Override
    public ItemStock read(String id) {
        Optional<ItemStock>result=itemStockRep.findById(id);
        if(result!=null){
            result.orElse(null);
        }
        return null;
    }

    @Override
    public List<ItemStock> readAlll() {
        return itemStockRep.findAll();
    }
    public void sellItem(String itemId,int number){
        itemStockRep.sellItem(itemId,number);
    }
}
