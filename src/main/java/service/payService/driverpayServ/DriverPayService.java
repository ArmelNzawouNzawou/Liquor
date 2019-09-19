package service.payService.driverpayServ;

import com.domain.driverPay.DriverPaymentProduct;
import com.factory.repository.DriverPayRepFac;
import com.repository.payment.DriverPay.DriverPayRep;

import java.util.ArrayList;

public class DriverPayService implements  DriverPayServiceInt{

    DriverPayRep driverPayRep;
    DriverPayRepFac driverPayRepFac = new DriverPayRepFac();

    private static DriverPayService driver=null;

    private DriverPayService() {
        driverPayRep= driverPayRepFac.getDriverpayRep("driverPayRep");
    }

    public static DriverPayService getDriver() {
        if(driver==null)
        {
            driver=new DriverPayService();
        }return driver;
    }

    @Override
    public DriverPaymentProduct create(DriverPaymentProduct driverPaymentProduct) {
        return driverPayRep.create(driverPaymentProduct);
    }

    @Override
    public DriverPaymentProduct update(DriverPaymentProduct driverPaymentProduct) {
        return driverPayRep.update(driverPaymentProduct);
    }

    @Override
    public void delete(String id) {
        driverPayRep.delete(id);
    }

    @Override
    public DriverPaymentProduct read(String id) {
        return driverPayRep.read(id);
    }

    @Override
    public ArrayList readAlll() {
        return driverPayRep.getAll();
    }
}
