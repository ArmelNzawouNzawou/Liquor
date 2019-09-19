package factory.domain.orderFactory;
import domain.orderBuilder.Orders;

/****THIS IS THE FACTORY OF THE ORDER*/
public class OrderFacto
{
    public static Orders getOrders(String orderNumeber, boolean orderCompleted, String comment)
    {
        return new Orders.Builder(orderNumeber)
                .buildComment(comment)
                .buildOrderCompleted(orderCompleted)
                .build();
    }
}
