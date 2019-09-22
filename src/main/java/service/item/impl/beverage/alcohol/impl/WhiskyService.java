package service.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Whisky;
import factory.repository.item.impl.beverage.alcohol.impl.WhiskyRepFactory;
import repository.item.impl.beverage.alcohol.impl.WhiskyRep;
import service.item.impl.beverage.alcohol.WhiskyInt;

import java.util.ArrayList;

public class WhiskyService implements WhiskyInt {

    private static WhiskyService whiskyRep=null;
    private WhiskyRep whisky= WhiskyRepFactory.getWhiskyRep();

    private WhiskyService() {
    }

    public static WhiskyService getWhiskyRep(){
        if(whiskyRep==null){
            whiskyRep=new WhiskyService();
        }return whiskyRep;
    }


    @Override
    public Whisky create(Whisky whisky) {
        return this.whisky.create(whisky);
    }

    @Override
    public Whisky update(Whisky whisky) {
        return this.whisky.update(whisky);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Whisky read(String id) {
        return whisky.read(id);
    }

    @Override
    public ArrayList<Whisky> readAlll() {
        return whisky.readAll();
    }
}
