package service.item.impl.impl;

import domain.item.impl.beverage.Beverage;
import factory.repository.item.impl.impl.BeverageRepFactory;
import org.springframework.stereotype.Component;
import repository.item.impl.impl.BeverageRep;
import service.item.BevergeInt;

import java.util.ArrayList;
@Component
public class BeverageService implements BevergeInt {
private BeverageRep bv = BeverageRepFactory.getBeverageRep();
    private static BeverageService beverageRep;

    private BeverageService() {
    }
    public static BeverageService getBeverageRep(){
        if(beverageRep==null){
            beverageRep=new BeverageService();
        }return beverageRep;
    }


    @Override
    public Beverage create(Beverage beverage) {
        return bv.create(beverage);
    }

    @Override
    public Beverage update(Beverage beverage) {
        return bv.update(beverage);
    }

    @Override
    public void delete(String id) {
        bv.delete(id);
    }

    @Override
    public Beverage read(String id) {
        return bv.read(id);
    }

    @Override
    public ArrayList<Beverage> readAlll() {
        return bv.readAll();
    }
}
