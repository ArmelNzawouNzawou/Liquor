package company.com.factory.domain.orderFactory;
import company.com.domain.orderBuilder.Orders;
import company.com.util.IdGenerator;

/****THIS IS THE FACTORY OF THE ORDER*/
public class OrderFacto
{
    public static Orders getOrders(String customerNumebr,String orderTime, String comment)
    {
        return new Orders.Builder(IdGenerator.getSuffixFromClassName(Orders.class))
                .buildComment(comment)
                .buildOrderTime(orderTime)
                .buildCustomer(customerNumebr)
                .build();
    }
    public static Orders updateOrders(String customerNumebr,String orderNumeber, String orderTime, String comment)
    {
        return new Orders.Builder(orderNumeber)
                .buildComment(comment)
                .buildCustomer(customerNumebr)
                .buildOrderTime(orderTime)
                .build();
    }
}
