package company.com.factory.services;

import company.com.service.orderServices.impl.OrderServices;

public class OrderServiceFact {
    public OrderServices getOrders()
    {
        return OrderServices.getOrderServices();

    }
}
