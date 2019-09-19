package factory.domain.orderTiming;


import domain.orderTiming.OrderTiming;

public class OrderTimingFactory {
    public static OrderTiming getOrderTiming(String OrderNumber, String timeOfPlacing, String timeOfPickUp, String timeOfComplition){
        return new OrderTiming.Builder(OrderNumber)
                .buildTComplition(timeOfComplition)
                .buildTPickUp(timeOfPickUp)
                .buildTPlacing(timeOfPlacing)
                .build();
    }
}
