package company.com.factory.repository;

import company.com.repository.payment.customerPay.impl.CashRep;

public class CashRepFactory {
    public static CashRep getCashRep(){
        return CashRep.getCashRep();
    }
}
