package factory.repository;

import repository.payment.customerPay.impl.CardRep;

public class CardRepFactory {
    public static CardRep getCardRep(){
        return CardRep.getCardRep();
    }
}
