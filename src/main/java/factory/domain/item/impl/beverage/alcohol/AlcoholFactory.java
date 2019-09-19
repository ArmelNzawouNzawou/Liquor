package factory.domain.item.impl.beverage.alcohol;

import com.domain.item.impl.beverage.alcohol.Alcohol;

public class AlcoholFactory {
    public static Alcohol getAlcohol(String Alcohol_id, String ContainerType, String alcoholePercentage , String item_id){
        return new Alcohol.Builder(Alcohol_id)
                .buildAlcoholPercentage(alcoholePercentage)
                .buildContaina(ContainerType)
                .buildItemId(item_id)
                .build();
    }
}
