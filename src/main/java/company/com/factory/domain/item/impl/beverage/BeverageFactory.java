package company.com.factory.domain.item.impl.beverage;
import company.com.domain.item.impl.beverage.Beverage;

public class BeverageFactory {
    public static Beverage getBeverage(String bev_id, String bevName, String item_id){
        return new Beverage.Builder(bev_id)
                .builBevName(bevName)
                .buildItem_id(item_id)
                .build();
    }
}
