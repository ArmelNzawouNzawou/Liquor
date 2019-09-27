package company.com.service.item.impl.beverage.nonalcohol.impl;

import company.com.domain.item.impl.beverage.nonalcohol.impl.CoolDrink;
import company.com.factory.repository.item.impl.beverage.nonalcohol.impl.CooledrinkRepFactory;
import company.com.repository.item.impl.beverage.nonalcohol.impl.CooledrinkRep;
import company.com.service.item.impl.beverage.nonalcohol.CooledrinkInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class CooledrinkService implements CooledrinkInt {
private static CooledrinkService cooledrinkRep=null;
private CooledrinkRep cooledrink= CooledrinkRepFactory.getCooledrinkRep();
    private CooledrinkService() {
    }
public static CooledrinkService getCooledrinkRep(){
        if(cooledrinkRep==null){
            cooledrinkRep=new CooledrinkService();
        }return cooledrinkRep;
}


    @Override
    public CoolDrink create(CoolDrink coolDrink) {
        return cooledrink.create(coolDrink);
    }

    @Override
    public CoolDrink update(CoolDrink coolDrink) {
        return cooledrink.update(coolDrink);
    }

    @Override
    public void delete(String id) {
        cooledrink.delete(id);
    }

    @Override
    public CoolDrink read(String id) {
        return cooledrink.read(id);
    }

    @Override
    public ArrayList<CoolDrink> readAlll() {
        return cooledrink.readAll();
    }
}
