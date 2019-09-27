package company.com.repository.item.impl.beverage.alcohol.impl;

import company.com.domain.item.impl.beverage.alcohol.impl.Beer;
import company.com.factory.domain.item.impl.beverage.alcohol.impl.BeerFactory;
import company.com.repository.item.impl.beverage.alcohol.BeerInt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class BeerRep implements BeerInt {

   /** String url = "jdbc:h2:~/LDS_DB";
    String user = "";
    String pwds = "";
    Connection conn;*/
    private static BeerRep beerRep=null;
    private ArrayList<Beer> mydb=new ArrayList<>();
    private BeerRep() {
       /* try {
            conn = DriverManager.getConnection(url, user, pwds);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

    }
    public static BeerRep getBeerRep(){
        if(beerRep==null){
            beerRep=new BeerRep();
        }return beerRep;
    }


    @Override
    public Beer create(Beer beer) {
    Beer result = findBeer(beer.getId());
    if(result==null&&beer!=null){
        Beer b= BeerFactory.getBeer(beer.getName(),beer.getSize(),beer.getPrice());
    mydb.add(b);
    return b;
}return null;
    }

    @Override
    public Beer update(Beer beer) {
        Beer result = findBeer(beer.getId());
        if(result!=null){
           delete(beer.getId());
            return create(result);
        }return null;
    }

    @Override
    public void delete(String s) {

        Beer result = findBeer(s);
        if(result!=null){mydb.remove(result);}
    }

    @Override
    public Beer read(String s) {
        Beer result = findBeer(s);
        if(result!=null){return result;}return null;
    }

    @Override
    public ArrayList<Beer> readAll() {
        return mydb;
    }

    public Beer findBeer(String id){
        return mydb.stream()
                .filter(B ->B.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
