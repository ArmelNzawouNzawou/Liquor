package company.com.service.item.impl.impl;

import company.com.domain.item.impl.beverage.Beverage;
import company.com.factory.repository.item.impl.impl.BeverageRepFactory;
import org.springframework.stereotype.Component;
import company.com.repository.item.impl.impl.BeverageRep;
import company.com.service.item.BevergeInt;

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
    public Beverage getBev(String name){
        return bv.getBev(name);
    }

    @Override
    public ArrayList<Beverage> readAlll() {
        return bv.readAll();
    }
}
