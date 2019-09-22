package service.item.impl.classic.impl;

import domain.item.impl.classic.impl.Snakes;
import factory.repository.item.impl.classic.impl.SnakesRepFactory;
import repository.item.impl.classic.impl.SnakesRep;
import service.item.impl.classic.SnakesInt;

import java.util.ArrayList;

public class SnakesService implements SnakesInt {
  private static SnakesService snakesRep=null;
  private SnakesRep snak= SnakesRepFactory.getSnakesRep();

    private SnakesService() {
    }
    public static SnakesService getsnakesRep(){
        if(snakesRep==null){
            snakesRep=new SnakesService();
        }return snakesRep;
    }


    @Override
    public Snakes create(Snakes snakes) {
        return snak.create(snakes);
    }

    @Override
    public Snakes update(Snakes snakes) {
        return snak.update(snakes);
    }

    @Override
    public void delete(String id) {
        snak.delete(id);
    }

    @Override
    public Snakes read(String id) {
        return snak.read(id);
    }

    @Override
    public ArrayList<Snakes> readAlll() {
        return snak.readAll();
    }
}
