package company.com.repository.item.impl.beverage.nonalcohol.impl;

import company.com.domain.item.impl.beverage.nonalcohol.impl.Juice;
import company.com.repository.item.impl.beverage.nonalcohol.JuiceInt;

import java.util.ArrayList;

public class JuiceRep implements JuiceInt {
    private static JuiceRep juiceRep=null;
    private ArrayList<Juice>mydb=new ArrayList<>();

    private JuiceRep() {
    }
    public static JuiceRep getJuiceRep(){
        if(juiceRep==null){
            juiceRep=new JuiceRep();
        }return juiceRep;
    }


    @Override
    public Juice create(Juice juice) {
        Juice result=findJuice(juice.getId());
        if(result==null){
            mydb.add(juice);
            return juice;
        }
        return null;
    }

    @Override
    public Juice update(Juice juice) {
        Juice result=findJuice(juice.getId());
        if(result!=null){
           delete(result.getId());
            return create(juice);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Juice result=findJuice(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public Juice read(String s) {
        Juice result=findJuice(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Juice> readAll() {
        return mydb;
    }

    public Juice findJuice(String id){
        return mydb.stream().filter(J ->J.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
