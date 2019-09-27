package company.com.factory.repository;
import company.com.repository.orderTime.impl.OrderTimeRep;

public class OrderLinrRepFacto {
    public static OrderTimeRep getOrderT(){
        return OrderTimeRep.getOrderTime();
    }
}
