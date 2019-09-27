package company.com.factory.domain.item.impl.beverage.alcohol;


import company.com.domain.item.impl.beverage.alcohol.Alcohol;

public class AlcoholFactory {
    public static Alcohol getAlcohol(String Alcohol_id, String ContainerType, String item_id){
        return new Alcohol.Builder(Alcohol_id)
                .buildDescription(ContainerType)
                .buildItemId(item_id)
                .build();
    }
}
