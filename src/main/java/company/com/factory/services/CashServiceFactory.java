package company.com.factory.services;

import company.com.service.payment.customerPay.impl.CashService;

public class CashServiceFactory {
    public static CashService getCashRep(){
        return CashService.getCashRepService();
    }
}
