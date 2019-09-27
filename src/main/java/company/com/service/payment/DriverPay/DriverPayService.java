package company.com.service.payment.DriverPay;

import company.com.domain.driverPay.DriverPay;
import company.com.factory.repository.DriverPayRepFactory;
import company.com.repository.payment.DriverPay.DriverPayRep;
import company.com.service.payment.DriverPayInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class DriverPayService implements DriverPayInt {

    private static DriverPayService driverPayRep=null;
    private DriverPayRep driverPayR= DriverPayRepFactory.getDriverPayRep();

    private DriverPayService() {

    }

    public static DriverPayService getDriverPayRep() {

        if (driverPayRep==null)
        {
             driverPayRep=new DriverPayService();
        }return driverPayRep;
    }


    @Override
    public DriverPay create(DriverPay driverPay) {
        return driverPayR.create(driverPay);
    }

    @Override
    public DriverPay update(DriverPay driverPay) {
        return driverPayR.update(driverPay);
    }

    @Override
    public void delete(String id) {
        driverPayR.delete(id);
    }

    @Override
    public DriverPay read(String id) {
        return driverPayR.read(id);
    }

    @Override
    public ArrayList<DriverPay> readAlll() {
        return driverPayR.readAll();
    }
}
