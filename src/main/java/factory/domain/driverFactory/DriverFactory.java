package factory.domain.driverFactory;

import domain.driver.Driver;

public class DriverFactory {

    public static Driver getDriver(String id ,String stat)
    {
       return new Driver.Builder(id)
               .buildStat(stat)
               .build();
    }
}
