package company.com.factory.domain.customerPaymentFactory;

import company.com.domain.customerPayment.CustomerPay;
import company.com.util.IdGenerator;

public class CustomerPayFactory {
public static CustomerPay getCustomerPay(String customerNumber,String orderNumber,String payType,String description){
    return new CustomerPay.Builder(customerNumber)
            .buildOrderNumber(orderNumber)
            .buildPayId(IdGenerator.getSuffixFromClassName(CustomerPay.class))
            .buildPayType(payType)
            .buildDescription(description)
            .build();
}
    public static CustomerPay updateCustomerPay(String customerNumber,String orderNumber,String payId,String payType ,String description){
        return new CustomerPay.Builder(customerNumber)
                .buildOrderNumber(orderNumber)
                .buildPayId(payId)
                .buildPayType(payType)
                .buildDescription(description)
                .build();
    }
}
