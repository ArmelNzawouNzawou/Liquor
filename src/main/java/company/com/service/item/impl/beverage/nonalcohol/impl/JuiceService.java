package company.com.service.item.impl.beverage.nonalcohol.impl;

import company.com.domain.item.impl.beverage.nonalcohol.impl.Juice;
import company.com.factory.repository.item.impl.beverage.nonalcohol.impl.JuiceRepFactory;
import company.com.repository.item.impl.beverage.nonalcohol.impl.JuiceRep;
import company.com.service.item.impl.beverage.nonalcohol.JuiceInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class JuiceService implements JuiceInt {
    private static JuiceService juiceRep=null;
    private JuiceRep juice= JuiceRepFactory.getJuiceRep();

    private JuiceService() {
    }
    public static JuiceService getJuiceRep(){
        if(juiceRep==null){
            juiceRep=new JuiceService();
        }return juiceRep;
    }


    @Override
    public Juice create(Juice juice) {
        return this.juice.create(juice);
    }

    @Override
    public Juice update(Juice juice) {
        return this.juice.update(juice);
    }

    @Override
    public void delete(String id) {
        juice.delete(id);
    }

    @Override
    public Juice read(String id) {
        return juice.read(id);
    }

    @Override
    public ArrayList<Juice> readAlll() {
        return juice.readAll();
    }
}
