package repository.item.impl.beverage.beverage_Bridge.impl;

import domain.item.impl.beverage.beverage_Bridge.Beverage_Alcohol;
import domain.item.impl.beverage.beverage_Bridge.Beverage_NonAlcohol;
import factory.domain.item.impl.beverage.beverage_Bridge.Beverage_AlcoholFactory;
import factory.domain.item.impl.beverage.beverage_Bridge.Beverage_NonalcolicFactory;
import repository.item.impl.beverage.beverage_Bridge.Beverage_NonalcoholInt;

import java.util.ArrayList;

public class Beverage_NonalcoholRep implements Beverage_NonalcoholInt {
    private static Beverage_NonalcoholRep beverage_alcoholRep;
    private ArrayList<Beverage_NonAlcohol> mydb =new ArrayList<>();

    private Beverage_NonalcoholRep() {
    }
    public static Beverage_NonalcoholRep getBeverage_alcoholServ(){
        if(beverage_alcoholRep==null){
            beverage_alcoholRep=new Beverage_NonalcoholRep();
        }return beverage_alcoholRep;
    }

    @Override
    public Beverage_NonAlcohol create(Beverage_NonAlcohol bev) {
        Beverage_NonAlcohol result=findB(bev.getId());
        if(result==null){
            Beverage_NonAlcohol result1= Beverage_NonalcolicFactory.getBeverage(bev.getBeverage_id(),bev.getDescription(),bev.getDescription());
            mydb.add(result1);
            return result1;
        }
        return null;
    }

    @Override
    public Beverage_NonAlcohol update(Beverage_NonAlcohol bev) {
        Beverage_NonAlcohol result=findB(bev.getId());
        if(result!=null){
            delete(result.getId());
            Beverage_NonAlcohol result1= Beverage_NonalcolicFactory.updateBeverage(bev.getId(),bev.getItem_id(),bev.getBeverage_id(),bev.getDescription());
            return create(result1);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Beverage_NonAlcohol result=findB(s);
        if(result!=null){
            mydb.remove(result);
        }

    }

    @Override
    public Beverage_NonAlcohol read(String s) {
        Beverage_NonAlcohol result=findB(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Beverage_NonAlcohol> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Beverage_NonAlcohol findB(String id){
        return mydb.stream()
                .filter(BA -> BA.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}


