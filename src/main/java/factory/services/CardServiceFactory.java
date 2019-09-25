package factory.services;

import repository.payment.customerPay.impl.CardRep;
import service.payment.customerPay.impl.CardRepService;

public class CardServiceFactory {
    public static CardRepService getCardRep(){
        return CardRepService.getCardRep();
    }
}
