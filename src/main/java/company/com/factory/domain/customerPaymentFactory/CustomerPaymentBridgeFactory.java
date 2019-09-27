package company.com.factory.domain.customerPaymentFactory;

import company.com.domain.customerPayment.CustomerPaymentBridge;

public class CustomerPaymentBridgeFactory {
    public static CustomerPaymentBridge getCustomerPaymentBridge(String customerNumber, String orderNumber, double amount, String payment_id, String arrengement_id, String payType, String bankName, String paymentDetaild){
        return new CustomerPaymentBridge.Builder(payment_id)
                .buildCustomerId(customerNumber)
                .buildOrderNumber(orderNumber)
                .buildAmount(amount)
                .buildArrengement_id(arrengement_id)
                .buildPaymentDetaild(paymentDetaild)
                .buildPayType(payType)
                .buildBankName(bankName)
                .build();
    }
}
