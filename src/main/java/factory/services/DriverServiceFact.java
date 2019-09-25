package factory.services;


import repository.drivers.impl.DriverRep;
import service.Driver.Impl.DriverService;

public class DriverServiceFact {
    public static DriverService getDriverRep()
    {return DriverService.getDriverService();
    }
}
