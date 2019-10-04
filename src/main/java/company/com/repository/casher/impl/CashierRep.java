package company.com.repository.casher.impl;

import company.com.domain.cashierBuilderPack.Cashier;
import company.com.repository.casher.CahierInterface;

import java.util.ArrayList;

public class CashierRep implements CahierInterface {
    private  static CashierRep cashierRep=null;
    private Cashier cashierProduct;
    private ArrayList<Cashier>mydb=new ArrayList<>();
   /** private Cashier cashier;
    private int value;


    private String url="jdbc:mysql://localhost:3306/lds_db?autoReconnect=true&useSSL=false";
    String user="root";
    String password="";
    Connection conne;

    //to get the company.com.factory that will help to build cashier
*/

    private CashierRep()
    {
        //cashierFactory.getCashier("cashier");
       /** try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }**/
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

        if(findCashier(cashierProduct.getEmail())==null){
            mydb.add(cashierProduct);
            return cashierProduct;
        }return null;

       /** int primeryKey=getItemNumber();
        System.out.println(cashierProduct.toString());


        try {
            String sql="INSERT INTO cashier(ID,FISTNAME,SURNAME) VALUES ("+primeryKey+",'"+cashierProduct.getName()+"','"+cashierProduct.getSurName()+"')";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one cashier row inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+primeryKey);*/
    }

    @Override
    public Cashier update(Cashier cashierProduct) {
        Cashier cashier=findCashier(cashierProduct.getEmail());
        if(cashier!=null){
            delete(cashier.getEmail());
           return create(cashierProduct);
        }return null;

        /**
        try {
            String sql="update CASHIER set NAME="+cashierProduct.getName()+",SURNAME="+cashierProduct.getSurName()+" where ID="+cashierProduct.getId()+" )";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+cashierProduct.getId());
         **/
    }

    @Override
    public void delete(String s) {// this method should read what is supposed to be deleted before deleting.
        Cashier cashier=findCashier(s);

        if(cashier!=null){
            mydb.remove(cashier);
        }

        /**int s2=Integer.parseInt(s);
        System.out.println("This record was deliter!!!");
        read(s);

        try {
            String sql="DELETE from CASHIER  WHERE ID ="+s2+";";
                PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public Cashier read(String s) {
        Cashier cashier=findCashier(s);

        if(cashier!=null){
            return cashier;
        }
        else return null;
        /**
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
         */
    }

    @Override
    public ArrayList<Cashier> readAll() {
        return mydb;

       /** Cashier cashier=null;
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
        */
    }



    public Cashier findCashier(String id){
        return mydb.stream()
                .filter(c ->c.getEmail().equals(id))
                .findAny()
                .orElse(null);
    }


}
