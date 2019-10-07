package company.com.service.orderLine.impl;

import company.com.domain.orderLine.OrderLine;
import company.com.repository.orderLine.OrderLineRepInt;
import company.com.service.orderLine.OrderLineServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderLineService implements OrderLineServiceInt {
    private static OrderLineService orderLineService;
    //private OrderLineRep orderLineRep= OrderLineRepFactory.getOrderLine();
    @Autowired
    OrderLineRepInt orderLineRep;

    private OrderLineService() {
    }

    public static OrderLineService getOrderLineService(){
        if(orderLineService==null){
            orderLineService=new OrderLineService();
        } return orderLineService;
    }
    @Override
    public OrderLine create(OrderLine orderLine) {
        return orderLineRep.save(orderLine);
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        Optional<OrderLine> result=orderLineRep.findById(orderLine.getLineId());
        if(result!=null){
            delete(orderLine.getLineId());
            result.orElse(null);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        orderLineRep.deleteById(id);
    }

    @Override
    public OrderLine read(String id) {
        Optional<OrderLine> result=orderLineRep.findById(id);
        return result.orElse(null);

    }

    @Override
    public List<OrderLine> readAlll() {
        return orderLineRep.findAll();
    }
}
