package company.com.factory.domain.customerDelivery;

import company.com.domain.customerDelivery.CustomerDelivery;

import java.util.ArrayList;

public class CustomerDeliveryFactory {
    public static CustomerDelivery getCustomerDelivery(String OrderId,ArrayList<String>itemID,String customerNumber,String orderTime,String comment,ArrayList<Integer> quatity){
        return new CustomerDelivery.Builder(customerNumber)
                .buildComment(comment)
                .buildItemId(itemID)
                .buildOrderId(OrderId)
                .buildOrdertTime(orderTime)
                .buildQuantity(quatity)
                .build();
    }
}
