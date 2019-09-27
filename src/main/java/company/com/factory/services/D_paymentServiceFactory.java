package company.com.factory.services;

import company.com.service.payment.DriverPay.D_paymentService;

public class D_paymentServiceFactory {
    public static D_paymentService getD_paymentRep(){
        return D_paymentService.getD_paymentRep();
    }
}
