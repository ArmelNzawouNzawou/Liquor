package factory.services;

import repository.orderTime.impl.OrderTimeRep;
import service.orderTime.impl.OrderTimeService;

public class OrderTimeServiceFactory {
    public static OrderTimeService getOrderTimeRep(){
        return OrderTimeService.getOrderTimeService();
    }
}
