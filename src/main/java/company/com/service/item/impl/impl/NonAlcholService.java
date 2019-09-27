package company.com.service.item.impl.impl;

import company.com.domain.item.impl.beverage.nonalcohol.NonAlcohol;
import company.com.factory.repository.item.impl.impl.NonAlcholRepFactory;
import company.com.repository.item.impl.impl.NonAlcholRep;
import company.com.service.item.NonAlcoholInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
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
