package factory.domain.item.impl.beverage;

import com.domain.item.impl.beverage.Beverage;

public class BeverageFactory {
    public static Beverage getBeverage(String bev_id,String size,String category,String item_id){
        return new Beverage.Builder(bev_id)
                .builCategory(category)
                .buildItem_id(item_id)
                .buildSize(size)
                .build();
    }
}
