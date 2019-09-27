package company.com.repository.item.impl.classic.impl;

import company.com.domain.item.impl.classic.impl.Snakes;
import company.com.repository.item.impl.classic.SnakesInt;

import java.util.ArrayList;

public class SnakesRep implements SnakesInt {
    private ArrayList<Snakes>mydb=new ArrayList<>();
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
        Snakes result= findIce(snakes.getId());
        if(result==null){
            mydb.add(snakes);
            return snakes;
        }
        return null;
    }

    @Override
    public Snakes update(Snakes snakes) {
        Snakes result= findIce(snakes.getId());
        if(result!=null){
          delete(result.getId());
            return create(snakes);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Snakes result= findIce(s);
        if(result!=null){
            mydb.remove(result);
        }
    }

    @Override
    public Snakes read(String s) {
        Snakes result= findIce(s);
        if(result!=null){
           return result;
        }
        return null;
    }

    @Override
    public ArrayList<Snakes> readAll() {
        return mydb;
    }

    public Snakes findIce(String id){
        return mydb.stream()
                .filter(C ->C.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
