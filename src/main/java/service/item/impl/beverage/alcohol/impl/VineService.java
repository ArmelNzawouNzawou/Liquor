package service.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Vine;
import factory.repository.item.impl.beverage.alcohol.impl.VineRepFactory;
import repository.item.impl.beverage.alcohol.impl.VineRep;
import service.item.impl.beverage.alcohol.VineInt;

import java.util.ArrayList;

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
