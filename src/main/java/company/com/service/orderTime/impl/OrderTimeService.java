package company.com.service.orderTime.impl;

import company.com.domain.orderTiming.OrderTiming;
import company.com.factory.repository.OrderTimeRepFactory;
import org.springframework.stereotype.Component;
import company.com.repository.orderTime.impl.OrderTimeRep;
import company.com.service.orderTime.OrderTimeInt;

import java.util.ArrayList;

@Component
public class OrderTimeService implements OrderTimeInt {
    private static OrderTimeService orderTimeService;
    private OrderTimeRep timeRep= OrderTimeRepFactory.getOrderTimeRep();

    private OrderTimeService() {
    }
    public static OrderTimeService getOrderTimeService(){
        if(orderTimeService==null){
            orderTimeService=new OrderTimeService();
        }return orderTimeService;
    }


    @Override
    public OrderTiming create(OrderTiming orderTiming) {
        return timeRep.create(orderTiming);
    }

    @Override
    public OrderTiming update(OrderTiming orderTiming) {
        return timeRep.update(orderTiming);
    }

    @Override
    public void delete(String id) {
        timeRep.delete(id);
    }

    @Override
    public OrderTiming read(String id) {
        return timeRep.read(id);
    }

    @Override
    public ArrayList<OrderTiming> readAlll() {
        return timeRep.readAll();
    }
}
