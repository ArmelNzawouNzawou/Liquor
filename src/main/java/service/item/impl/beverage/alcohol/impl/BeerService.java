package service.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Beer;
import factory.repository.item.impl.beverage.alcohol.impl.BeerRepFactory;
import org.springframework.stereotype.Component;
import repository.item.impl.beverage.alcohol.impl.BeerRep;
import service.item.impl.beverage.alcohol.BeerInt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
@Component
public class BeerService implements BeerInt {

    String url = "jdbc:h2:~/LDS_DB";
    String user = "";
    String pwds = "";
    Connection conn;
    private static BeerService beerService=null;
    private BeerRep beerRep= BeerRepFactory.getBeerRep();
    private BeerService() {
        try {
            conn = DriverManager.getConnection(url, user, pwds);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static BeerService getBeerRep(){
        if(beerService==null){
            beerService=new BeerService();
        }return beerService;
    }


    @Override
    public Beer create(Beer beer) {
        return beerRep.create(beer);
    }

    @Override
    public Beer update(Beer beer) {
        return beerRep.update(beer);
    }

    @Override
    public void delete(String id) {

        beerRep.delete(id);
    }

    @Override
    public Beer read(String id) {
        return beerRep.read(id);
    }

    @Override
    public ArrayList<Beer> readAlll() {
        return beerRep.readAll();
    }
}
