package repository.item.impl.classic.impl;

import domain.item.impl.classic.impl.Snakes;
import repository.item.impl.classic.SnakesInt;

import java.util.ArrayList;

public class SnakesRep implements SnakesInt {
  private static SnakesRep snakesRep=null;

    private SnakesRep() {
    }
    public static SnakesRep getsnakesRep(){
        if(snakesRep==null){
            snakesRep=new SnakesRep();
        }return snakesRep;
    }


    @Override
    public Snakes create(Snakes snakes) {
        return null;
    }

    @Override
    public Snakes update(Snakes snakes) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Snakes read(String s) {
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
