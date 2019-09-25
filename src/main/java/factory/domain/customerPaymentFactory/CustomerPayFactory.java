package factory.domain.customerPaymentFactory;

import domain.customerPayment.CustomerPay;

public class CustomerPayFactory {
public static CustomerPay getCustomerPay(String customerNumber,String orderNumber,String payId,String payType){
    return new CustomerPay.Builder(customerNumber)
            .buildOrderNumber(orderNumber)
            .buildPayId(payId)
            .buildPayType(payType)
            .build();
}
}
