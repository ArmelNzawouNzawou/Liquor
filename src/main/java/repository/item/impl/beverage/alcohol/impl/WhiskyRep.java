package repository.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Whisky;
import repository.item.impl.beverage.alcohol.WhiskyInt;

import java.util.ArrayList;

public class WhiskyRep implements WhiskyInt {

    private static WhiskyRep whiskyRep=null;
    private ArrayList<Whisky>mydb= new ArrayList<>();

    private WhiskyRep() {
    }

    public static WhiskyRep getWhiskyRep(){
        if(whiskyRep==null){
            whiskyRep=new WhiskyRep();
        }return whiskyRep;
    }

    @Override
    public Whisky create(Whisky whisky) {
        Whisky result=findWhisky(whisky.getId());
        if(result==null){
            mydb.add(whisky);
            return whisky;
        }
        return null;
    }

    @Override
    public Whisky update(Whisky whisky) {
        Whisky result=findWhisky(whisky.getId());
        if(result!=null){
            delete(result.getId());
            mydb.add(whisky);
            return whisky;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Whisky result=findWhisky(s);
        if(result!=null){
            mydb.remove(result);

        }
    }

    @Override
    public Whisky read(String s) {
        Whisky result=findWhisky(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Whisky> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Whisky findWhisky(String id){
        return mydb.stream().filter(W ->W.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
