package company.com.factory.repository;

import company.com.repository.orderLine.impl.OrderLineRep;

public class OrderLineRepFactory {
    public static OrderLineRep getOrderLine(){
        return OrderLineRep.getOrderLineRep();
    }
}
