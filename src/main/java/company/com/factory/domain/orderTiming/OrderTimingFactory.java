package company.com.factory.domain.orderTiming;


import company.com.domain.orderTiming.OrderTiming;

public class OrderTimingFactory {
    public static OrderTiming getOrderTiming( String description,String OrderNumber, String timeOfPlacing, String timeOfPickUp, String timeOfComplition){
        return new OrderTiming.Builder(OrderNumber)
                .buildTComplition(timeOfComplition)
                .buildTPickUp(timeOfPickUp)
                .buildTPlacing(timeOfPlacing)
                .buildDescription(description)
                .build();
    }
}
