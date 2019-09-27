package company.com.factory.repository;

import company.com.repository.orderRepository.impl.OrderRep;

public class OrderRepFact {
    public OrderRep getOrders()
    {
        return OrderRep.getOrders();

    }
}
