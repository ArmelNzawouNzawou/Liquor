package repository.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Beer;
import repository.item.impl.beverage.alcohol.BeerInt;

import java.util.ArrayList;

public class BeerRep implements BeerInt {

    private static BeerRep beerRep=null;
    private BeerRep() {
    }
    public static BeerRep getBeerRep(){
        if(beerRep==null){
            beerRep=new BeerRep();
        }return beerRep;
    }


    @Override
    public Beer create(Beer beer) {
        return null;
    }

    @Override
    public Beer update(Beer beer) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Beer read(String s) {
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
