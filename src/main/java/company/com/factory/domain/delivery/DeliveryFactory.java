package company.com.factory.domain.delivery;


import company.com.domain.delivery.Delivery;

public class DeliveryFactory {
    public static Delivery getDelivery(String deliveryNumber, String orderNumber, String customerNumber, String cashierNumber){
        return new Delivery.Builder(deliveryNumber)
                .buildCashierNumber(cashierNumber)
                .buildCustomerNumber(customerNumber)
                .buildOderNumber(orderNumber)
                .build();
    }
}
