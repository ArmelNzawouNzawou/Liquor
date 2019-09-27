package company.com.repository.item.impl.beverage.nonalcohol.impl;

import company.com.domain.item.impl.beverage.nonalcohol.impl.CoolDrink;
import company.com.repository.item.impl.beverage.nonalcohol.CooledrinkInt;

import java.util.ArrayList;

public class CooledrinkRep implements CooledrinkInt {
private static CooledrinkRep cooledrinkRep=null;
private ArrayList<CoolDrink> mydb= new ArrayList<>();
    private CooledrinkRep() {
    }
public static CooledrinkRep getCooledrinkRep(){
        if(cooledrinkRep==null){
            cooledrinkRep=new CooledrinkRep();
        }return cooledrinkRep;
}

    @Override
    public CoolDrink create(CoolDrink coolDrink) {
        CoolDrink result = findCooldrink(coolDrink.getId());
        if(result==null){
            mydb.add(coolDrink);
            return coolDrink;
        }
        return null;
    }

    @Override
    public CoolDrink update(CoolDrink coolDrink) {
        CoolDrink result = findCooldrink(coolDrink.getId());
        if(result!=null){
           delete(result.getId());
            return create(coolDrink);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        CoolDrink result = findCooldrink(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public CoolDrink read(String s) {
        CoolDrink result = findCooldrink(s);
        if(result!=null){
            return result;
        }return null;
    }

    @Override
    public ArrayList<CoolDrink> readAll() {
        return mydb;
    }

    public CoolDrink findCooldrink(String id){
        return mydb.stream()
                .filter(C ->C.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
