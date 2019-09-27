package company.com.factory.services;

import company.com.service.payment.DriverPay.DriverPayService;

public class DriverPayServiceFactory {
    public static DriverPayService getDriverPayRep()
    {
        return DriverPayService.getDriverPayRep();
    }
}
