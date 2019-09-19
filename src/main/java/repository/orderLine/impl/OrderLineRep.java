package repository.orderLine.impl;

import domain.orderLine.OrderLine;
import factory.domain.orderLine.OrderLineFactory;
import repository.orderLine.OrderLineInt;

import java.sql.*;
import java.util.ArrayList;

public class OrderLineRep implements OrderLineInt {
    private  static OrderLineRep orderLineRep=null;

    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    String user="root";
    String password="";
    Connection conne;

    public OrderLineRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static OrderLineRep getOrderLineRep(){
        if(orderLineRep==null){
            orderLineRep=new OrderLineRep();
        }return orderLineRep;
    }

    @Override
    public OrderLine create(OrderLine orderLine) {
        int primeryKey=getItemNumber();
        try {
            String sql="insert into  ORDER_LINE ( LINE_ID ,ORDER_NUMBER , ITEM_NUMBER)" +
                    "VALUES ("+primeryKey+","+orderLine.getOrderId()+",'"+orderLine.getItemID()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return read(""+primeryKey);
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        try {
            String sql="update ORDER_LINE set ORDER_NUMBER="+orderLine.getOrderId()+",ITEM_NUMBER='"+orderLine.getItemID()+"'WHERE LINE_ID='"+orderLine.getLineId()+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row updated in Driver table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(orderLine.getLineId());
    }

    @Override
    public void delete(String s) {
        int s2=Integer.parseInt(s);

        //before deleting we read first
        System.out.println(read(s).toString()+"\n this order is deleted");
        try {
            String sql="DELETE from ORDER_LINE WHERE LINE_ID="+s2+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public OrderLine read(String s) {
        OrderLine a1=null;
        int s2=Integer.parseInt(s);
        try {
            String sql="select * from ORDER_LINE WHERE LINE_ID="+s2+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                a1= OrderLineFactory.getOrderLine(rs.getString(1),rs.getString(2),rs.getString(3));

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
        OrderLine a1=null;
        ArrayList<String> myList2 = new ArrayList<>();
        try {
            String sql = "select * from ORDER_LINE ;";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                a1= OrderLineFactory.getOrderLine(rs.getString(1),rs.getString(2),rs.getString(3));
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

            String sql="SELECT MAX(LINE_ID) from ORDER_LINE ;";
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
}
