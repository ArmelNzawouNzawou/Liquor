package company.com.factory.domain.orderLine;


import company.com.domain.orderLine.OrderLine;
import company.com.util.IdGenerator;

public class OrderLineFactory {
    public static OrderLine getOrderLine(String OrderId, String itemID){
        return new OrderLine.Builder(IdGenerator.getSuffixFromClassName(OrderLine.class))
                .buildItemID(itemID)
                .buildOrderId(OrderId)
                .build();
    }
    public static OrderLine updateOrderLine(String lineId, String OrderId, String itemID){
        return new OrderLine.Builder(lineId)
                .buildItemID(itemID)
                .buildOrderId(OrderId)
                .build();
    }
}
