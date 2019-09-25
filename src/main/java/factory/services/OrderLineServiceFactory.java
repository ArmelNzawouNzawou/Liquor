package factory.services;
import repository.orderTime.impl.OrderTimeRep;
import service.orderTime.impl.OrderTimeService;

public class OrderLineServiceFactory {
    public static OrderTimeService getOrderT(){
        return OrderTimeService.getOrderTimeService();
    }
}
