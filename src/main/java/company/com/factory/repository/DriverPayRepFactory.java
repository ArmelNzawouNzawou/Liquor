package company.com.factory.repository;

import company.com.repository.payment.DriverPay.DriverPayRep;

public class DriverPayRepFactory {
    public static DriverPayRep getDriverPayRep()
    {
        return DriverPayRep.getDriverPayRep();
    }
}
