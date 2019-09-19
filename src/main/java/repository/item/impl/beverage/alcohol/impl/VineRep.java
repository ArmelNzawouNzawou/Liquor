package repository.item.impl.beverage.alcohol.impl;

import repository.item.impl.beverage.alcohol.VineInt;

import java.util.ArrayList;

public class VineRep implements VineInt {
    private static VineRep vine=null;

    private VineRep() {
    }
    public static VineRep getVine(){
        if(vine==null){
            vine = new VineRep();
        }return vine;
    }

    @Override
    public domain.item.impl.beverage.alcohol.impl.Vine create(domain.item.impl.beverage.alcohol.impl.Vine vine) {
        return null;
    }

    @Override
    public domain.item.impl.beverage.alcohol.impl.Vine update(domain.item.impl.beverage.alcohol.impl.Vine vine) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public domain.item.impl.beverage.alcohol.impl.Vine read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
