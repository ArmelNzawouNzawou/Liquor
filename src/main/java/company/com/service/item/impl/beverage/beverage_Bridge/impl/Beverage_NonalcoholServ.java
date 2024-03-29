package company.com.service.item.impl.beverage.beverage_Bridge.impl;
import company.com.domain.item.impl.beverage.beverage_Bridge.Beverage_NonAlcohol;
import company.com.factory.repository.item.impl.beverage.beverage_Bridge.Beverage_NonalcolicRapFactory;
import company.com.repository.item.impl.beverage.beverage_Bridge.impl.Beverage_NonalcoholRep;
import company.com.service.item.impl.beverage.beverage_Bridge.Beverage_NonalcoholInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Beverage_NonalcoholServ implements Beverage_NonalcoholInt {
    private static Beverage_NonalcoholServ beverage_nonalcoholServ;
    private Beverage_NonalcoholRep BAR= Beverage_NonalcolicRapFactory.getBeverage();

    private Beverage_NonalcoholServ() {
    }
    public static Beverage_NonalcoholInt getBeverage_Non(){
        if(beverage_nonalcoholServ==null){
            beverage_nonalcoholServ=new Beverage_NonalcoholServ();
        } return beverage_nonalcoholServ;
    }


    @Override
    public Beverage_NonAlcohol create(Beverage_NonAlcohol beverage_nonAlcohol) {
        return BAR.create(beverage_nonAlcohol);
    }

    @Override
    public Beverage_NonAlcohol update(Beverage_NonAlcohol beverage_nonAlcohol) {
        return BAR.update(beverage_nonAlcohol);
    }

    @Override
    public void delete(String id) {
        BAR.delete(id);
    }

    @Override
    public Beverage_NonAlcohol read(String id) {
        return BAR.read(id);
    }

    @Override
    public ArrayList<Beverage_NonAlcohol> readAlll() {
        return BAR.readAll();
    }
}
