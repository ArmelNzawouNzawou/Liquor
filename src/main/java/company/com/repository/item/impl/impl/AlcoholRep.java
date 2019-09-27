package company.com.repository.item.impl.impl;

import company.com.domain.item.impl.beverage.alcohol.Alcohol;
import company.com.repository.item.AlcoholInt;

import java.util.ArrayList;

public class AlcoholRep implements AlcoholInt {
    private ArrayList<Alcohol>mydb=new ArrayList<>();
    private static AlcoholRep alcoholRep=null;

    private AlcoholRep() {
    }
    public static AlcoholRep getAlcoholRep(){
        if(alcoholRep==null){
            alcoholRep=new AlcoholRep();
        }return alcoholRep;
    }

    @Override
    public Alcohol create(Alcohol alcohol) {
        Alcohol result = findAlcohol(alcohol.getAlcohol_id());
        if(result==null){
            mydb.add(alcohol);
            return alcohol;
        }
        return null;
    }

    @Override
    public Alcohol update(Alcohol alcohol) {
        Alcohol result = findAlcohol(alcohol.getAlcohol_id());
        if(result!=null){
           delete(result.getAlcohol_id());
            return create(alcohol);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Alcohol result = findAlcohol(s);
        if(result!=null){
            mydb.remove(result);
        }

    }

    @Override
    public Alcohol read(String s) {
        Alcohol result = findAlcohol(s);
        if(result!=null){

            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Alcohol> readAll() {
        return mydb;
    }

    public Alcohol findAlcohol(String id){
        return mydb.stream()
                .filter(C ->C.getAlcohol_id().equals(id))
                .findAny()
                .orElse(null);
    }
}
