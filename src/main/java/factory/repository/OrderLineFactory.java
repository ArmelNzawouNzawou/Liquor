package factory.repository;
import repository.orderTime.impl.OrderTimeRep;

public class OrderLineFactory {
    public static OrderTimeRep getOrderT(){
        return OrderTimeRep.getOrderTime();
    }
}
