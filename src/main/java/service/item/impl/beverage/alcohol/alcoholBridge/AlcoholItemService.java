package service.item.impl.beverage.alcohol.alcoholBridge;

import domain.item.impl.beverage.alcohol.Alcohol;
import domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import factory.repository.item.impl.beverage.alcohol.impl.AlcoholItemFactory;
import org.springframework.stereotype.Component;
import repository.item.impl.beverage.alcohol.AlcoholItemInt;
import repository.item.impl.beverage.alcohol.alcoholBridge.AlcoholItemRepository;
import service.item.impl.beverage.alcohol.AlcoholItemIntS;

import java.util.ArrayList;
@Component
public class AlcoholItemService implements AlcoholItemIntS {

    private static AlcoholItemService alco=null;
    private ArrayList<AlcoholItem>mydb=new ArrayList<>();
    AlcoholItemRepository AIRF= AlcoholItemFactory.getAlcoholItem();

    private AlcoholItemService() {
    }

    public static AlcoholItemService getAlco(){
        if(alco==null){
            alco=new AlcoholItemService();
        }return alco;
    }


    @Override
    public AlcoholItem create(AlcoholItem alcoholItem) {
        return AIRF.create(alcoholItem);
    }

    @Override
    public AlcoholItem update(AlcoholItem alcoholItem) {
        return AIRF.update(alcoholItem);
    }

    @Override
    public void delete(String id) {
        AIRF.delete(id);
    }

    @Override
    public AlcoholItem read(String id) {
        return AIRF.read(id);
    }

    @Override
    public ArrayList<AlcoholItem> readAlll() {
        return AIRF.readAll();
    }
}
