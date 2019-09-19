package repository.payment.DriverPay;

import domain.driverPay.D_pay;
import repository.payment.D_payment;

import java.util.ArrayList;

public class D_paymentRep implements D_payment {
    private static D_paymentRep d_paymentRep;

    private D_paymentRep() {
    }
    public static D_paymentRep getD_paymentRep(){
        if(d_paymentRep==null){
            d_paymentRep=new D_paymentRep();
        }return d_paymentRep;
    }

    @Override
    public D_pay create(D_pay d_pay) {
        return null;
    }

    @Override
    public D_pay update(D_pay d_pay) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public D_pay read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
