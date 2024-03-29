package company.com.repository.item.impl.impl;

import company.com.domain.item.impl.beverage.Beverage;
import company.com.repository.item.BevergeInt;

import java.util.ArrayList;

public class BeverageRep implements BevergeInt {
    private ArrayList<Beverage>mydb=new ArrayList<>();
    private static BeverageRep beverageRep;

    private BeverageRep() {
    }
    public static BeverageRep getBeverageRep(){
        if(beverageRep==null){
            beverageRep=new BeverageRep();
        }return beverageRep;
    }


    @Override
    public Beverage create(Beverage beverage) {
        Beverage result= findAlcohol(beverage.getBev_id());
        if(result==null){
            mydb.add(beverage);
            return beverage;
        }
        return null;
    }

    @Override
    public Beverage update(Beverage beverage) {
        Beverage result= findAlcohol(beverage.getBev_id());
        if(result!=null){
            delete(result.getBev_id());
            return create(beverage);
        }
        return null;
    }

    @Override
    public void delete(String s) {

        Beverage result= findAlcohol(s);
        if(result!=null){
            mydb.remove(result);
        }
    }

    @Override
    public Beverage read(String s) {
        Beverage result= findAlcohol(s);
        if(result!=null){

            return result;
        }
        return null;
    }
    public Beverage getBev(String name){
        return mydb.stream()
                .filter(B -> B.getBevName().equals(name))
                .findAny()
                .orElse(null);
    }

    @Override
    public ArrayList<Beverage> readAll() {
        return mydb;
    }

    public Beverage findAlcohol(String id){
        return mydb.stream()
                .filter(C ->C.getBev_id().equals(id))
                .findAny()
                .orElse(null);
    }
}
