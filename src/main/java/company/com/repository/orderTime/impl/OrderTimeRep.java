package company.com.repository.orderTime.impl;


import company.com.domain.orderTiming.OrderTiming;
import company.com.repository.orderTime.OrderTimeInt;

import java.util.ArrayList;

public class OrderTimeRep implements OrderTimeInt {
    private static OrderTimeRep orderTimeRep=null;
    private ArrayList<OrderTiming>mydb =new ArrayList<>();

    public OrderTimeRep() {

    }
    public static OrderTimeRep getOrderTime(){
        if(orderTimeRep==null){
            orderTimeRep=new OrderTimeRep();
        }return orderTimeRep;
    }

    @Override
    public OrderTiming create(OrderTiming orderTiming) {
        OrderTiming result=findOrderTiming(orderTiming.getOrderNumber());
        if(result==null){
            mydb.add(orderTiming);
            return orderTiming;
        }return null;

    }

    @Override
    public OrderTiming update(OrderTiming orderTiming) {
        OrderTiming result=findOrderTiming(orderTiming.getOrderNumber());
        if(result!=null){
           delete(result.getOrderNumber());
            return create(orderTiming);
        }return null;
    }

    @Override
    public void delete(String s) {
        OrderTiming result=findOrderTiming(s);
        if(result!=null){
        mydb.remove(result);
        }
    }

    @Override
    public OrderTiming read(String s) {
        OrderTiming result=findOrderTiming(s);
        if(result!=null){
            return result;
        }return null;
    }

    @Override
    public ArrayList<OrderTiming> readAll() {
        return mydb;
    }

    public OrderTiming findOrderTiming(String id){
        return mydb.stream()
                .filter(C ->C.getOrderNumber().equals(id))
                .findAny()
                .orElse(null);
    }
}
