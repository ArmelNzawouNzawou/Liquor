package service.orderServices.impl;

import domain.orderBuilder.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import repository.orderRepository.impl.OrderRep;
import service.orderServices.IOrder;

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
    public Orders create(Orders orders) {
        return orderRep.create(orders);
    }

    @Override
    public Orders update(Orders orders) {
        return orderRep.update(orders);
    }

    @Override
    public void delete(String id) {
        orderRep.delete(id);
    }

    @Override
    public Orders read(String id) {
        return orderRep.read(id);
    }

    @Override
    public ArrayList<Orders> readAlll() {
        return orderRep.readAll();
    }
}
