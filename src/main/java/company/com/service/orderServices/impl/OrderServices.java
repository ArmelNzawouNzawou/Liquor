package company.com.service.orderServices.impl;

import company.com.domain.orderBuilder.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import company.com.repository.orderRepository.impl.OrderRep;
import company.com.service.orderServices.IOrder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class OrderServices implements IOrder {

    private static OrderServices orderServices=null;
    private OrderRep orderRep=OrderRep.getOrders();


    private OrderServices()
    {

    }
    public static OrderServices getOrderServices()
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
