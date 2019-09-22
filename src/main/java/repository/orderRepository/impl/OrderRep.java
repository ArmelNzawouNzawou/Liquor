package repository.orderRepository.impl;

import domain.orderBuilder.Orders;
import domain.orderLine.OrderLine;
import factory.domain.orderFactory.OrderFacto;
import repository.orderRepository.OrderRepositoryIn;

import java.sql.*;
import java.util.ArrayList;

public class OrderRep implements OrderRepositoryIn
{

    private static OrderRep orderRep=null;
    private ArrayList<Orders>mydb=new ArrayList<>();


    private OrderRep()
    {

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
        Orders result=findOrderLine(ord.getOrderNumeber());
        if(result==null){
            mydb.add(ord);
            return ord;
        }return null;
    }

    @Override
    public Orders update(Orders ord) {
        Orders result=findOrderLine(ord.getOrderNumeber());
        if(result!=null){
            delete(result.getOrderNumeber());
            return create(ord);
        }return null;
    }

    @Override
    public void delete(String s) {
        Orders result=findOrderLine(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public Orders read(String s) {
        Orders result=findOrderLine(s);
        if(result!=null){
            return result;
        }return null;

    }

    @Override
    public ArrayList<Orders> readAll() {
       return mydb;
    }


    @Override
    public int getItemNumber() {

        return 0;
    }


    public Orders findOrderLine(String id){
        return mydb.stream()
                .filter(C ->C.getOrderNumeber().equals(id))
                .findAny()
                .orElse(null);
    }

}
