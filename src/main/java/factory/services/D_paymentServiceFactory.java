package factory.services;

import repository.payment.DriverPay.D_paymentRep;
import service.payment.DriverPay.D_paymentService;

public class D_paymentServiceFactory {
    public static D_paymentService getD_paymentRep(){
        return D_paymentService.getD_paymentRep();
    }
}
