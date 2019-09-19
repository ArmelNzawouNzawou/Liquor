package repository.item.impl.impl;

import domain.item.impl.beverage.alcohol.Alcohol;
import repository.item.AlcoholInt;

import java.util.ArrayList;

public class AlcoholRep implements AlcoholInt {
    private static AlcoholRep alcoholRep=null;

    private AlcoholRep() {
    }
    public static AlcoholRep getAlcoholRep(){
        if(alcoholRep==null){
            alcoholRep=new AlcoholRep();
        }return alcoholRep;
    }

    @Override
    public Alcohol create(Alcohol alcohol) {
        return null;
    }

    @Override
    public Alcohol update(Alcohol alcohol) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Alcohol read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
