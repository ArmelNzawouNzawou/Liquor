package company.com.service.payment.DriverPay;

import company.com.domain.driverPay.D_pay;
import company.com.factory.repository.D_paymentRepFactory;
import company.com.repository.payment.DriverPay.D_paymentRep;
import company.com.service.payment.D_payment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class D_paymentService implements D_payment {
    private static D_paymentService d_paymentRep;
    public D_paymentRep d_paymentR= D_paymentRepFactory.getD_paymentRep();

    private D_paymentService() {
    }
    public static D_paymentService getD_paymentRep(){
        if(d_paymentRep==null){
            d_paymentRep=new D_paymentService();
        }return d_paymentRep;
    }


    @Override
    public D_pay create(D_pay d_pay ) {
        return d_paymentR.create(d_pay);
    }

    @Override
    public D_pay update(D_pay d_pay) {
        return d_paymentR.update(d_pay);
    }

    @Override
    public void delete(String id) {
        d_paymentR.delete(id);
    }

    @Override
    public D_pay read(String id) {
        return d_paymentR.read(id);
    }

    @Override
    public ArrayList<D_pay> readAlll() {
        return d_paymentR.readAll();
    }
}
