package factory.repository;

import repository.payment.DriverPay.DriverPayRep;

public class DriverPayRepFactory {
    public DriverPayRep getDriverPayRep()
    {
        return DriverPayRep.getDriverPayRep();
    }
}
