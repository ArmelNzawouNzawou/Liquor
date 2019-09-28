package company.com.repository.ItemTrensaction;

import company.com.domain.item.Item;
import company.com.domain.itemTrensaction.ItemStock;
import company.com.factory.domain.item.ItemFactory;
import company.com.factory.domain.itemTransaction.ItemStockFactory;

import java.util.ArrayList;

public class ItemStockRep implements ItemStockRepInt {
    private static ItemStockRep itemStockRep;
    private ArrayList<ItemStock>mydb=new ArrayList<>();
    private  ItemStockRep(){}
    public static ItemStockRep getItemStockRep(){
        if(itemStockRep==null){
            itemStockRep=new ItemStockRep();
        }return itemStockRep;
    }
    @Override
    public ItemStock create(ItemStock it) {
        ItemStock res=findItemstockWithItemId(it.getItemId());
        if(res==null){
            mydb.add(it);
            return it;
        }
        return null;
    }

    @Override
    public ItemStock update(ItemStock it) {
        ItemStock res=findItemstockWithItemId(it.getItemId());
        if(res!=null){
            ItemStock itemStock1=ItemStockFactory.updateItemStock(it.getStockId(),it.getItemId(),it.getItemPrice(),it.getQuantity(),it.getDescrption());
            delete(res.getItemId());
            return create(itemStock1);

        }
        return null;
    }

    @Override
    public void delete(String id) {
        ItemStock res=findItemstockWithItemId(id);
        if(res!=null){
            mydb.remove(res);
        }
    }

    @Override
    public ItemStock read(String id) {
        ItemStock res=findItemstockWithItemId(id);
        if(res!=null){
            return res;
        }
        return null;
    }

    @Override
    public ArrayList<ItemStock> readAll() {
        return mydb;
    }
    public void sellItem(String itemId,int numberOfItem){
        ItemStock res=findItemstockWithItemId(itemId);
        if(res!=null&&res.getQuantity()<=numberOfItem){
            ItemStock update= ItemStockFactory.updateItemStock(res.getStockId(),res.getItemId(),res.getItemPrice(),res.getQuantity()-numberOfItem,res.getDescrption());
            delete(itemId);
            update(update);
        }
    }
    public ItemStock findItemstockWithItemId(String itemId){
        return mydb.stream()
                .filter(I -> I.getItemId().equals(itemId))
                .findAny()
                .orElse(null);
    }
    public ItemStock findItemstockWithStockId(String stockId){
        return mydb.stream()
                .filter(I ->I.getStockId().equals(stockId))
                .findAny()
                .orElse(null);
    }
}
