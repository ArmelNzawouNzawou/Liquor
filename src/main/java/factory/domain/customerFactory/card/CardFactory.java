package factory.domain.customerFactory.card;

import domain.customerPayment.impl.Card;

public class CardFactory {
    public static Card getCard(String customerNumber,String bankName,String paymentDetaild,double amount,String payment_id,String arrengement_id){
        return new Card.Builder(payment_id)
                .buildCustomerNumebr(customerNumber)
                .buildbankName(bankName)
                .buildpaymentDetaild(paymentDetaild)
                .buildAmount(amount)
                .buildArrengementId(arrengement_id)
                .build();
    }
}
