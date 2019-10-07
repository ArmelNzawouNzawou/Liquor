package company.com.repository.item.impl.beverage.alcohol.alcoholBridge;

import company.com.domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import company.com.repository.item.impl.beverage.alcohol.AlcoholItemInt;

import java.util.ArrayList;

public class AlcoholItemRepository{}/** implements AlcoholItemInt {

    private static AlcoholItemRepository alco=null;
    private ArrayList<AlcoholItem>mydb=new ArrayList<>();

    private AlcoholItemRepository() {
    }

    public static AlcoholItemRepository getAlco(){
        if(alco==null){
            alco=new AlcoholItemRepository();
        }return alco;
    }

    @Override
    public AlcoholItem create(AlcoholItem alcoholItem) {
        AlcoholItem al=findAlcoholItem(alcoholItem.getId());
        if(al==null){
            mydb.add(alcoholItem);
            return alcoholItem;
        }
        return null;
    }

    @Override
    public AlcoholItem update(AlcoholItem alcoholItem) {
        AlcoholItem al=findAlcoholItem(alcoholItem.getId());
        if(al!=null){
            delete(al.getId());
            create(alcoholItem);
            return alcoholItem;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        AlcoholItem al=findAlcoholItem(s);
        if(al!=null){
           mydb.remove(al);
        }
    }

    @Override
    public AlcoholItem read(String s) {
        AlcoholItem al=findAlcoholItem(s);
        if(al!=null){
           return al;
        }return null;
    }

    @Override
    public ArrayList<AlcoholItem> readAll() {
        return mydb;
    }

    public AlcoholItem findAlcoholItem(String id){
        return mydb.stream()
                .filter(A -> A.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
*/