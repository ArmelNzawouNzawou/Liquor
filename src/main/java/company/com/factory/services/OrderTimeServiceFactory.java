package company.com.factory.services;

import company.com.service.orderTime.impl.OrderTimeService;

public class OrderTimeServiceFactory {
    public static OrderTimeService getOrderTimeRep(){
        return OrderTimeService.getOrderTimeService();
    }
}
