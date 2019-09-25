package factory.domain.item.impl.beverage;
import domain.item.impl.beverage.Beverage;

public class BeverageFactory {
    public static Beverage getBeverage(String bev_id, String category, String item_id){
        return new Beverage.Builder(bev_id)
                .builCategory(category)
                .buildItem_id(item_id)
                .build();
    }
}
