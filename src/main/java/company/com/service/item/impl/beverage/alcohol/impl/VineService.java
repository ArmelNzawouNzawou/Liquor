package company.com.service.item.impl.beverage.alcohol.impl;

import company.com.domain.item.impl.beverage.alcohol.impl.Vine;
import company.com.factory.repository.item.impl.beverage.alcohol.impl.VineRepFactory;
import company.com.repository.item.impl.beverage.alcohol.impl.VineRep;
import company.com.service.item.impl.beverage.alcohol.VineInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class VineService implements VineInt {
    private static VineService vine=null;

    private VineRep vineRep= VineRepFactory.getVineRep();
    private VineService() {
    }
    public static VineService getVine(){
        if(vine==null){
            vine = new VineService();
        }return vine;
    }


    @Override
    public Vine create(Vine vine) {
        return vineRep.create(vine);
    }

    @Override
    public Vine update(Vine vine) {
        return vineRep.update(vine);
    }

    @Override
    public void delete(String id) {
        vineRep.delete(id);
    }

    @Override
    public Vine read(String id) {
        return null;
    }

    @Override
    public ArrayList<Vine> readAlll() {
        return vineRep.readAll();
    }
}
