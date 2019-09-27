package company.com.repository.item.impl.beverage.alcohol.impl;

import company.com.domain.item.impl.beverage.alcohol.impl.Vine;
import company.com.repository.item.impl.beverage.alcohol.VineInt;

import java.util.ArrayList;

public class VineRep implements VineInt {
    private static VineRep vine=null;
    private ArrayList<Vine>mydb= new ArrayList<>();

    private VineRep() {
    }
    public static VineRep getVine(){
        if(vine==null){
            vine = new VineRep();
        }return vine;
    }

    @Override
    public Vine create(Vine vine) {
        Vine result=findVine(vine.getId());
        if(result==null){
            mydb.add(vine);
            return vine;
        }
        return null;
    }

    @Override
    public Vine update(Vine vine) {
        Vine result=findVine(vine.getId());
        if(result!=null){
            delete(result.getId());
            return create(vine);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Vine result=findVine(s);
        if(result!=null){
        mydb.remove(result);}
    }

    @Override
    public Vine read(String s) {
        Vine result=findVine(s);
        if(result!=null){
            return result;
        }return null;
    }

    @Override
    public ArrayList<Vine> readAll() {
        return mydb;
    }

    public Vine findVine(String id){
        return mydb.stream()
                .filter(V -> V.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
