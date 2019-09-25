package factory.repository;

import repository.orderRepository.impl.OrderRep;

public class OrderRepFact {
    public OrderRep getOrders()
    {
        return OrderRep.getOrders();

    }
}
