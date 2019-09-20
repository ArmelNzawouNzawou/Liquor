package service.orderServices;

import factory.domain.orderFactory.OrderFacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import repository.orderRepository.impl.OrderRep;

import java.util.ArrayList;

public class OrderServices implements IOrder {
    @Autowired
    @Qualifier("orderService")
    private static OrderServices orderServices=null;
    private OrderRep orderRep=OrderRep.getOrders();


    private OrderServices()
    {

    }
    public static OrderServices getInstance()
    {
        if(orderServices==null)
        {
            orderServices=new OrderServices();
        }
        return orderServices;
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Object read(String id) {
        return null;
    }

    @Override
    public ArrayList readAlll() {
        return null;
    }
    /**
    public void insertRow(Orders orders)
    {
        setterObject.buildOrderNumber(orders.getOrderNumeber());
        setterObject.buildCustomerNumber(orders.getCustomerNumber());
        setterObject.buildCashierId(orders.getCashierId());
        setterObject.buildDriverNumber(orders.getDriverNumber());
        setterObject.buildComment(orders.getComment());
        setterObject.buildTimeOfPlacing(orders.getTimeOfPlacing());
        setterObject.buildTimeOfCompletion(orders.getTimeOfComplition());
        setterObject.buildTimeOfPickUp(orders.getTimeOfPickUp());
        setterObject.buildOrderCompleted(orders.isOrderCompleted());
        System.out.println(orderRep.insertAll(setterObject.getOrders()));

    }*/
}
