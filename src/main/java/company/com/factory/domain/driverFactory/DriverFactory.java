package company.com.factory.domain.driverFactory;

import company.com.domain.driver.Driver;
import company.com.util.IdGenerator;

public class DriverFactory {

    public static Driver getDriver(String email ,String stat, String name,String surname) {
       return new Driver.Builder(email)
               .buildStat(stat)
               .buildName(name)
               .buildSurname(surname)
               .build();
    }
    public static Driver updateDriver(String id ,String stat, String name,String surname) {
        return new Driver.Builder(id)
                .buildStat(stat)
                .buildName(name)
                .buildSurname(surname)
                .build();
    }
}
