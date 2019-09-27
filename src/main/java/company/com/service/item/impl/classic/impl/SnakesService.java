package company.com.service.item.impl.classic.impl;

import company.com.domain.item.impl.classic.impl.Snakes;
import company.com.factory.repository.item.impl.classic.impl.SnakesRepFactory;
import company.com.repository.item.impl.classic.impl.SnakesRep;
import company.com.service.item.impl.classic.SnakesInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
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
