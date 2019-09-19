package factory.repository;


import repository.drivers.impl.DriverRep;

public class DriverRepFact {
    DriverRep driverRep;
    public static DriverRep getDriverRep()
    {return DriverRep.getInstance();
    }
}
