package repository.casher;

import domain.cashierBuilderPack.Cashier;
import factory.domain.cashierFactory.CashierFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.*;
import java.util.ArrayList;

public class CashierRep implements CahierInterface {
    private  static CashierRep cashierRep=null;
    private Cashier cashier;
    private int value;
    private Cashier cashierProduct;

    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    String user="root";
    String password="";
    Connection conne;

    //to get the factory that will help to build cashier


    private CashierRep()
    {
        //cashierFactory.getCashier("cashier");
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static CashierRep getCashierRep() {
        if(cashierRep==null)
        {
            cashierRep =new CashierRep();
        }
        return cashierRep;
    }

    @Override
    public Cashier create(Cashier cashierProduct) {

        int primeryKey=getItemNumber();
        System.out.println(cashierProduct.toString());


        try {
            String sql="INSERT INTO cashier(ID,FISTNAME,SURNAME) VALUES ("+primeryKey+",'"+cashierProduct.getName()+"','"+cashierProduct.getSurName()+"')";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one cashier row inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+primeryKey);
    }

    @Override
    public Cashier update(Cashier cashierProduct) {
        //cashier = new Cashier();
        try {
            String sql="update CASHIER set NAME="+cashierProduct.getName()+",SURNAME="+cashierProduct.getSurName()+" where ID="+cashierProduct.getId()+" )";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+cashierProduct.getId());
    }

    @Override
    public void delete(String s) {// this method should read what is supposed to be deleted before deleting.
        int s2=Integer.parseInt(s);
        System.out.println("This record was deliter!!!");
        read(s);

        try {
            String sql="DELETE from CASHIER  WHERE ID ="+s2+";";
                PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cashier read(String s) {
        Cashier cashier=null;
        try {
            String sql="select * from CASHIER WHERE ID="+s+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                cashier=CashierFactory.getCashier(rs.getString(1),rs.getString(2),rs.getInt(3));

        } }catch (SQLException e)
            {
            e.printStackTrace();
        }
        return cashier;
    }

    @Override
    public ArrayList<String> readAll() {
        Cashier cashier=null;
        ArrayList<String>myList=new ArrayList<>();

        try {
            String sql="select * from CASHIER ORDER BY ID;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {

                cashier=CashierFactory.getCashier(rs.getString(1),rs.getString(2),rs.getInt(3));
                myList.add(cashier.toString());

            } }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public int getItemNumber() {
        int highValeu=0;
        try {
            String sql="select MAX(ID) from CASHIER ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                highValeu=Integer.parseInt(rs.getString(1));
            } }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e )
    {
        highValeu=1000;
    }catch (NumberFormatException x){ highValeu=1000;}


        return highValeu;

    }
  public ArrayList getAll()
    {
        ArrayList<Cashier>myList=new ArrayList<>();
        ArrayList<String>myList2=new ArrayList<>();

        try {
            String sql="select * from cashier ORDER BY ID;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                Cashier cashier=CashierFactory.getCashier(rs.getString(1),rs.getString(2),rs.getInt(3));
                myList2.add(cashier.toString());

            } }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return myList2;

    }
}
