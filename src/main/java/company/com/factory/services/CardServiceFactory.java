package company.com.factory.services;

import company.com.service.payment.customerPay.impl.CardRepService;

public class CardServiceFactory {
    public static CardRepService getCardRep(){
        return CardRepService.getCardRep();
    }
}
