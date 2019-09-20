package repository.orderTime.impl;


import domain.orderTiming.OrderTiming;
import factory.domain.orderTiming.OrderTimingFactory;
import repository.orderTime.OrderTimeInt;

import java.sql.*;
import java.util.ArrayList;

public class OrderTimeRep implements OrderTimeInt {
    private static OrderTimeRep orderTimeRep=null;

    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    String user="root";
    String password="";
    Connection conne;

    public OrderTimeRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static OrderTimeRep getOrderTime(){
        if(orderTimeRep==null){
            orderTimeRep=new OrderTimeRep();
        }return orderTimeRep;
    }

    @Override
    public OrderTiming create(OrderTiming orderTiming) {
        int primeryKey=getItemNumber();

        try {
            String sql="INSERT INTO ORDER_TIME(ORDER_NUMBER, T_PLACING, T_PICKUP, T_COMPLITION) VALUES ("+orderTiming.getOrderNumber()+",'"+orderTiming.getTimeOfPlacing()+"','"+orderTiming.getTimeOfPickUp()+"','"+orderTiming.getTimeOfComplition()+"')";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one cashier row inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+primeryKey);
    }

    @Override
    public OrderTiming update(OrderTiming orderTiming) {
        try {
            String sql="update ORDER_TIME set T_PLACING="+orderTiming.getTimeOfPlacing()+",T_PICKUP="+orderTiming.getTimeOfPickUp()+",T_COMPLITION="+orderTiming.getTimeOfComplition()+" where ORDER_NUMBER="+orderTiming.getOrderNumber()+" )";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(orderTiming.getOrderNumber());
    }

    @Override
    public void delete(String s) {
        int s2=Integer.parseInt(s);
        System.out.println("This record was deliter!!!");
        read(s);

        try {
            String sql="DELETE from ORDER_TIME  WHERE ORDER_NUMBER ="+s2+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public OrderTiming read(String s) {
        OrderTiming orderTiming=null;
        try {
            String sql="select * from CASHIER WHERE ORDER_NUMBER="+s+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                orderTiming= OrderTimingFactory.getOrderTiming(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));

            } }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return orderTiming;
    }

    @Override
    public ArrayList<String> readAll() {
        OrderTiming orderTiming=null;
        ArrayList<String>myList=new ArrayList<>();

        try {
            String sql="select * from CASHIER ORDER BY ORDER_NUMBER;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {

                orderTiming= OrderTimingFactory.getOrderTiming(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                myList.add(orderTiming.toString());

            } }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
