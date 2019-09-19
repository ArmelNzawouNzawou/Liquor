package factory.repository;

import repository.payment.customerPay.impl.CashRep;

public class CashRepFactory {
    public static CashRep getCashRep(){
        return CashRep.getCashRep();
    }
}
