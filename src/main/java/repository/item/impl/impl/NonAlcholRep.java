package repository.item.impl.impl;

import domain.item.impl.beverage.nonalcohol.NonAlcohol;
import repository.item.NonAlcoholInt;

import java.util.ArrayList;

public class NonAlcholRep implements NonAlcoholInt {
    private static NonAlcholRep nonAlcholRep;
    private NonAlcholRep(){

    }
    public static NonAlcholRep getNonAlcholRep(){
        if(nonAlcholRep==null){
            nonAlcholRep=new NonAlcholRep();
        }return nonAlcholRep;
    }
    @Override
    public NonAlcohol create(NonAlcohol nonAlcohol) {
        return null;
    }

    @Override
    public NonAlcohol update(NonAlcohol nonAlcohol) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public NonAlcohol read(String s) {
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
