package service.orderLine.impl;

import domain.orderLine.OrderLine;
import factory.repository.OrderLineRepFactory;
import repository.orderLine.impl.OrderLineRep;
import service.orderLine.OrderLineInt;

import java.util.ArrayList;

public class OrderLineService implements OrderLineInt {
    private static OrderLineService orderLineService;
    private OrderLineRep orderLineRep= OrderLineRepFactory.getOrderLine();

    private OrderLineService() {
    }

    public static OrderLineService getOrderLineService(){
        if(orderLineService==null){
            orderLineService=new OrderLineService();
        } return orderLineService;
    }
    @Override
    public OrderLine create(OrderLine orderLine) {
        return orderLineRep.create(orderLine);
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        return orderLineRep.update(orderLine);
    }

    @Override
    public void delete(String id) {
        orderLineRep.delete(id);
    }

    @Override
    public OrderLine read(String id) {
        return orderLineRep.read(id);
    }

    @Override
    public ArrayList<OrderLine> readAlll() {
        return orderLineRep.readAll();
    }
}
