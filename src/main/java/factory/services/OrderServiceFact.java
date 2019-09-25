package factory.services;

import repository.orderRepository.impl.OrderRep;
import service.orderServices.impl.OrderServices;

public class OrderServiceFact {
    public OrderServices getOrders()
    {
        return OrderServices.getOrderServices();

    }
}
