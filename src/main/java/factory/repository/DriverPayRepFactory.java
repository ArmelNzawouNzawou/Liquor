package factory.repository;

import repository.payment.DriverPay.DriverPayRep;

public class DriverPayRepFactory {
    public static DriverPayRep getDriverPayRep()
    {
        return DriverPayRep.getDriverPayRep();
    }
}
