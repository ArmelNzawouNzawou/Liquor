package company.com.factory.services;


import company.com.service.Driver.Impl.DriverService;

public class DriverServiceFact {
    public static DriverService getDriverRep()
    {return DriverService.getDriverService();
    }
}
