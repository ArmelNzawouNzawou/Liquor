package repository.item.impl.beverage.beverage_Bridge.impl;

import domain.item.impl.beverage.beverage_Bridge.Beverage_Alcohol;
import factory.domain.item.impl.beverage.beverage_Bridge.Beverage_AlcoholFactory;
import repository.item.impl.beverage.beverage_Bridge.Beverage_AlcoholInt;
import service.item.impl.beverage.beverage_Bridge.impl.Beverage_AlcoholServ;

import java.util.ArrayList;

//a bridge class between beverage and all the Alcohole Item
public class Beverage_AlcoholRepo implements Beverage_AlcoholInt {
    private static Beverage_AlcoholRepo beverage_alcoholRep;
    private ArrayList<Beverage_Alcohol>mydb =new ArrayList<>();

    private Beverage_AlcoholRepo() {
    }
    public static Beverage_AlcoholRepo getBeverage_alcoholServ(){
        if(beverage_alcoholRep==null){
            beverage_alcoholRep=new Beverage_AlcoholRepo();
        }return beverage_alcoholRep;
    }

    @Override
    public Beverage_Alcohol create(Beverage_Alcohol bev) {
        Beverage_Alcohol result=findB(bev.getId());
        if(result==null){
            Beverage_Alcohol result1= Beverage_AlcoholFactory.getAlcoholItem(bev.getItem_id(),bev.getBeverage_id(),bev.getDescription());
            mydb.add(result1);
            return result1;
        }
        return null;
    }

    @Override
    public Beverage_Alcohol update(Beverage_Alcohol bev) {
        Beverage_Alcohol result=findB(bev.getId());
        if(result!=null){
            Beverage_Alcohol result1= Beverage_AlcoholFactory.updateAlcoholItem(bev.getId(),bev.getItem_id(),bev.getBeverage_id(),bev.getDescription());
            create(result1);
            return result1;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Beverage_Alcohol result=findB(s);
        if(result!=null){
            mydb.remove(result);
        }

    }

    @Override
    public Beverage_Alcohol read(String s) {
        Beverage_Alcohol result=findB(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Beverage_Alcohol> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Beverage_Alcohol findB(String id){
        return mydb.stream()
                .filter(BA -> BA.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
