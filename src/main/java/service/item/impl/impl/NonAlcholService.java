package service.item.impl.impl;

import domain.item.impl.beverage.nonalcohol.NonAlcohol;
import factory.domain.item.impl.beverage.nonalcohol.NonAlcoholFactory;
import factory.repository.item.impl.impl.NonAlcholRepFactory;
import repository.item.impl.impl.NonAlcholRep;
import service.item.NonAlcoholInt;

import java.util.ArrayList;

public class NonAlcholService implements NonAlcoholInt {

    private NonAlcholRep non= NonAlcholRepFactory.getNonAlcholRep();
    private static NonAlcholService nonAlcholRep;
    private NonAlcholService(){

    }
    public static NonAlcholService getNonAlcholRep(){
        if(nonAlcholRep==null){
            nonAlcholRep=new NonAlcholService();
        }return nonAlcholRep;
    }

    @Override
    public NonAlcohol create(NonAlcohol nonAlcohol) {
        return non.create(nonAlcohol);
    }

    @Override
    public NonAlcohol update(NonAlcohol nonAlcohol) {
        return non.update(nonAlcohol);
    }

    @Override
    public void delete(String id) {
        non.delete(id);
    }

    @Override
    public NonAlcohol read(String id) {
        return non.read(id);
    }

    @Override
    public ArrayList<NonAlcohol> readAlll() {
        return non.readAll();
    }
}
