package company.com.service.item.impl.beverage.alcohol.alcoholBridge;

import company.com.domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import company.com.factory.repository.item.impl.beverage.alcohol.impl.AlcoholItemFactory;
import company.com.repository.item.impl.beverage.alcohol.AlcoholItemInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import company.com.repository.item.impl.beverage.alcohol.alcoholBridge.AlcoholItemRepository;
import company.com.service.item.impl.beverage.alcohol.AlcoholItemIntS;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AlcoholItemService implements AlcoholItemIntS {

    private static AlcoholItemService alco=null;
    private ArrayList<AlcoholItem>mydb=new ArrayList<>();
    //AlcoholItemRepository AIRF= AlcoholItemFactory.getAlcoholItem();
    @Autowired
    AlcoholItemInt alcoholItemInt;
    private AlcoholItemService() {
    }

    public static AlcoholItemService getAlco(){
        if(alco==null){
            alco=new AlcoholItemService();
        }return alco;
    }


    @Override
    public AlcoholItem create(AlcoholItem alcoholItem) {
        return alcoholItemInt.save(alcoholItem);
    }

    @Override
    public AlcoholItem update(AlcoholItem alcoholItem) {
        Optional<AlcoholItem> result=alcoholItemInt.findById(alcoholItem.getId());
        if(result!=null){
            delete(alcoholItem.getId());
            alcoholItemInt.save(alcoholItem);
            return result.orElse(null);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Optional<AlcoholItem> result=alcoholItemInt.findById(id);
        if(result!=null){
            alcoholItemInt.deleteById(id);
        }
    }

    @Override
    public AlcoholItem read(String id) {
        Optional<AlcoholItem> result=alcoholItemInt.findById(id);
        if(result!=null){
            return result.orElse(null);
        }
        return null;
    }

    @Override
    public List<AlcoholItem> readAlll() {
        return alcoholItemInt.findAll();
    }
}
