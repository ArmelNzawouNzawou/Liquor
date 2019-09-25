package factory.services;

import repository.payment.customerPay.impl.CashRep;
import service.payment.customerPay.impl.CashService;

public class CashServiceFactory {
    public static CashService getCashRep(){
        return CashService.getCashRepService();
    }
}
