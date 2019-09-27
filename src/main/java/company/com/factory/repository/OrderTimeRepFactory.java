package company.com.factory.repository;

import company.com.repository.orderTime.impl.OrderTimeRep;

public class OrderTimeRepFactory {
    public static OrderTimeRep getOrderTimeRep(){
        return OrderTimeRep.getOrderTime();
    }
}
