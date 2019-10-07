package company.com.service.orderServices.impl;

import company.com.domain.orderBuilder.Orders;
import company.com.repository.orderRepository.OrderRepositoryIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import company.com.repository.orderRepository.impl.OrderRep;
import company.com.service.orderServices.IOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServices implements IOrder {

    private static OrderServices orderServices=null;
   // private OrderRep orderRep=OrderRep.getOrders();

    @Autowired
    private OrderRepositoryIn orderRep;
    private OrderServices() {

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
        return orderRep.save(orders);
    }

    @Override
    public Orders update(Orders orders) {
        Optional<Orders> result=orderRep.findById(orders.getOrderNumeber());
        if(result!=null){
            delete(orders.getOrderNumeber());
            orderRep.save(orders);
            return orders;
        }
        return null;
    }

    @Override
    public void delete(String id) {
        orderRep.deleteById(id);
    }

    @Override
    public Orders read(String id) {
        Optional<Orders> result=orderRep.findById(id);
        if(result!=null) {
            return result.orElse(null);
        }return null;
    }

    @Override
    public List<Orders> readAlll() {
        return orderRep.findAll();
    }
}
