package repository.orderRepository.impl;

import domain.orderBuilder.Orders;
import factory.domain.orderFactory.OrderFacto;
import repository.orderRepository.OrderRepositoryIn;

import java.sql.*;
import java.util.ArrayList;

public class OrderRep implements OrderRepositoryIn
{
    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    String user="root";
    String password="";
    Connection conne;
    private static OrderRep orderRep=null;


    private OrderRep()
    {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static OrderRep getOrders()
    {
        if(orderRep==null){
            orderRep= new OrderRep();}
        return orderRep;

    }
    //String sql="CREATE TABLE ORDERS(ORDER_NUMBER INTEGER(6),CUSTOMER_NUMBER INTEGER(6),DRIVER_NUMBER INTEGER(6),CASHIER_NUMBER INTEGER(6),TIME_PLACING VARCHAR(10),TIME_PICKUP VARCHAR(10),TIME_COMPLETION VARCHAR(10),ORDER_COMPLETED boolean ,COMMENT varchar(30))";
    @Override
    public Orders create(Orders ord) {
        int primeryKey=getItemNumber();
        try {
            String sql="insert into ORDERS(ORDER_NUMBER ,ORDER_COMPLETED ,COMMENT)" +
                    "VALUES ("+primeryKey+","+ord.isOrderCompleted()+",'"+ord.getComment()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return read(""+primeryKey);
    }

    @Override
    public Orders update(Orders ord) {
        try {
            String sql="update ORDERS set ORDER_COMPLETED="+ord.isOrderCompleted()+",COMMENT='"+ord.getComment()+"'WHERE ORDER_NUMBER='"+ord.getOrderNumeber()+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row updated in Driver table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(ord.getOrderNumeber());
    }

    @Override
    public void delete(String s) {
        int s2=Integer.parseInt(s);

        //before deleting we read first
        System.out.println(read(s).toString()+"\n this order is deleted");
        try {
            String sql="DELETE from ORDERS WHERE ORDER_NUMBER="+s2+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Orders read(String s) {
        Orders a1=null;
        int s2=Integer.parseInt(s);
        try {
            String sql="select * from ORDERS WHERE ORDER_NUMBER="+s2+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                a1= OrderFacto.getOrders(rs.getString(1),rs.getBoolean(2),rs.getString(3));

            } }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e)
        {
            System.out.println("!!! THIS CUSTOMER DOES NOT EXIST");
        }
        return a1;

    }

    @Override
    public ArrayList<String> readAll(String type) {
        Orders a1=null;
        ArrayList<String> myList2 = new ArrayList<>();
        try {
            String sql = "select * from ADDRESS ;";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                a1=OrderFacto.getOrders(rs.getString(1),rs.getBoolean(2),rs.getString(3));
                myList2.add(a1.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException x) {
        }
        return myList2;
    }


    @Override
    public int getItemNumber() {
        int highValeu=0;
        try {

            String sql="SELECT MAX(ORDER_NUMBER) from ORDERS ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while (rs.next())
            {
                String s=rs.getString(1);
                highValeu=Integer.parseInt(s)+1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (NullPointerException e )
        {
            highValeu=1000;
        }catch (NumberFormatException x){ highValeu=1000;}


        return highValeu;
    }


    public Orders insert(Orders orderClass) {
        return null;
    }


    @Override
    public String insertAll(Orders order)// i think this method should be used to pass in the valeus for the new orders.
    {


        return null;
    }

}
