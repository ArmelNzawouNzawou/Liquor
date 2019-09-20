package factory.services;


import service.Driver.DriverService;

public class DriverServeiceFac {
    DriverService driverS;
    public DriverService getDriverS(String s)
    {
        if(s.equalsIgnoreCase("driverService"))
        {
            return driverS.getDriverService();
        }else  return null;
    }
}
