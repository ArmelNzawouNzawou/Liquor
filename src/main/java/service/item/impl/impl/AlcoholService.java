package service.item.impl.impl;

import domain.item.impl.beverage.alcohol.Alcohol;
import factory.repository.item.impl.impl.AlcoholRepFactory;
import org.springframework.stereotype.Component;
import repository.item.impl.impl.AlcoholRep;
import service.item.AlcoholInt;

import java.util.ArrayList;
@Component
public class AlcoholService implements AlcoholInt {

    private AlcoholRep alco= AlcoholRepFactory.getAlcoholRep();
    private static AlcoholService alcoholRep=null;

    private AlcoholService() {
    }
    public static AlcoholService getAlcoholRep(){
        if(alcoholRep==null){
            alcoholRep=new AlcoholService();
        }return alcoholRep;
    }

    @Override
    public Alcohol create(Alcohol alcohol) {
        return alco.create(alcohol);
    }

    @Override
    public Alcohol update(Alcohol alcohol) {
        return alco.update(alcohol);
    }

    @Override
    public void delete(String id) {
        alco.delete(id);
    }

    @Override
    public Alcohol read(String id) {
        return alco.read(id);
    }

    @Override
    public ArrayList<Alcohol> readAlll() {
        return alco.readAll();
    }
}
