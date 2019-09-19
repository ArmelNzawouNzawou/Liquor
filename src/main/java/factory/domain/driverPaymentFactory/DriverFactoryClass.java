package factory.domain.driverPaymentFactory;

import com.domain.payPack.Payment;
import com.domain.payPack.driverPayPeriod.DailyPayment;
import com.domain.payPack.driverPayPeriod.MounthlyPayments;
import com.domain.payPack.driverPayPeriod.WeeklyPayment;

public class DriverFactoryClass
{
    public static Payment getPayment(String payType){
        if(payType.equalsIgnoreCase("daily")){
            return new DailyPayment();
        }
        else if(payType.equals("maouth")){
            return new MounthlyPayments();
        }else if(payType.equals("weekly")){
            return new WeeklyPayment();
        }
        else return null;
    }
    

}
