package company.com.factory.repository;

import company.com.repository.payment.customerPay.impl.CardRep;

public class CardRepFactory {
    public static CardRep getCardRep(){
        return CardRep.getCardRep();
    }
}
