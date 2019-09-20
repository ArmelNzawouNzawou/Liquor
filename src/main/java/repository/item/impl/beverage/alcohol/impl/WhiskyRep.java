package repository.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Whisky;
import repository.item.impl.beverage.alcohol.WhiskyInt;

import java.util.ArrayList;

public class WhiskyRep implements WhiskyInt {

    private static WhiskyRep whiskyRep=null;

    private WhiskyRep() {
    }

    public static WhiskyRep getWhiskyRep(){
        if(whiskyRep==null){
            whiskyRep=new WhiskyRep();
        }return whiskyRep;
    }

    @Override
    public Whisky create(Whisky whisky) {
        return null;
    }

    @Override
    public Whisky update(Whisky whisky) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Whisky read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
