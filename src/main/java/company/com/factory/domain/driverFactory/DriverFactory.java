package company.com.factory.domain.driverFactory;

import company.com.domain.driver.Driver;

public class DriverFactory {

    public static Driver getDriver(String id ,String stat)
    {
       return new Driver.Builder(id)
               .buildStat(stat)
               .build();
    }
}
