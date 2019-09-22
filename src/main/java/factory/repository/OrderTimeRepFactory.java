package factory.repository;

import repository.orderTime.impl.OrderTimeRep;

public class OrderTimeRepFactory {
    public static OrderTimeRep getOrderTimeRep(){
        return OrderTimeRep.getOrderTime();
    }
}
