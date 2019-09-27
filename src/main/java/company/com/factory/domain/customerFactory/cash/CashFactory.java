package company.com.factory.domain.customerFactory.cash;

import company.com.domain.customerPayment.impl.Cash;

public class CashFactory {
    public static Cash getCash(String customerNumber,String orderNumber,double amount,String payment_id,String arrengement_id){
        return new Cash.Builder(payment_id)
                .buildAmount(amount)
                .buildOrderNumber(orderNumber)
                .buildCustomerNumebr(customerNumber)
                .buildArrengementId(arrengement_id)
                .build();
    }
}
