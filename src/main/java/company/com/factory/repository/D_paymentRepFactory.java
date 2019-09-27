package company.com.factory.repository;

import company.com.repository.payment.DriverPay.D_paymentRep;

public class D_paymentRepFactory {
    public static D_paymentRep getD_paymentRep(){
        return D_paymentRep.getD_paymentRep();
    }
}
