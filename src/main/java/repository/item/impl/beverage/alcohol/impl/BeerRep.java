package repository.item.impl.beverage.alcohol.impl;

import domain.item.impl.beverage.alcohol.impl.Beer;
import repository.item.impl.beverage.alcohol.BeerInt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class BeerRep implements BeerInt {

    String url = "jdbc:h2:~/LDS_DB";
    String user = "";
    String pwds = "";
    Connection conn;
    private static BeerRep beerRep=null;
    private BeerRep() {
        try {
            conn = DriverManager.getConnection(url, user, pwds);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static BeerRep getBeerRep(){
        if(beerRep==null){
            beerRep=new BeerRep();
        }return beerRep;
    }


    @Override
    public Beer create(Beer beer) {
        String sql="INSERT INTO CASHIER VALUES(1, 'Hello','HI');";
        return null;
    }

    @Override
    public Beer update(Beer beer) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Beer read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
