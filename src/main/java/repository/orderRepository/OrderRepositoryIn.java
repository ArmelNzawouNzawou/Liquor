package repository.orderRepository;

import domain.orderBuilder.Orders;
import repository.Irepository;

public interface OrderRepositoryIn extends Irepository<Orders,String>
{
   String insertAll(Orders orders);
    //ArrayList<OrderClass>orderList();
}
