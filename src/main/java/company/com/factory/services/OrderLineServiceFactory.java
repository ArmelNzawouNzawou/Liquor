package company.com.factory.services;
import company.com.service.orderTime.impl.OrderTimeService;

public class OrderLineServiceFactory {
    public static OrderTimeService getOrderT(){
        return OrderTimeService.getOrderTimeService();
    }
}
