package factory.services;

import repository.payment.DriverPay.DriverPayRep;
import service.payment.DriverPay.DriverPayService;

public class DriverPayServiceFactory {
    public static DriverPayService getDriverPayRep()
    {
        return DriverPayService.getDriverPayRep();
    }
}
