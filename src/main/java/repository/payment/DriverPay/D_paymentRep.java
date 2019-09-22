package repository.payment.DriverPay;

import domain.customerPayment.CustomerPay;
import domain.driverPay.D_pay;
import repository.payment.D_payment;

import java.util.ArrayList;

public class D_paymentRep implements D_payment {
    private static D_paymentRep d_paymentRep;
    private ArrayList<D_pay> mydb=new ArrayList<>();

    private D_paymentRep() {
    }
    public static D_paymentRep getD_paymentRep(){
        if(d_paymentRep==null){
            d_paymentRep=new D_paymentRep();
        }return d_paymentRep;
    }

    @Override
    public D_pay create(D_pay d_pay) {
        D_pay result=findD_pay(d_pay.getPayCode());
        if(result==null){
            mydb.add(d_pay);
            return d_pay;
        }
        return null;
    }

    @Override
    public D_pay update(D_pay d_pay) {
        D_pay result=findD_pay(d_pay.getPayCode());
        if(result!=null){
           delete(d_pay.getPayCode());
            return create(d_pay);
        }
        return null;
    }

    @Override
    public void delete(String s) {

        D_pay result=findD_pay(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public D_pay read(String s) {
        D_pay result=findD_pay(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<D_pay> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public D_pay findD_pay(String id){
        return mydb.stream()
                .filter(C ->C.getPayCode().equals(id))
                .findAny()
                .orElse(null);
    }
}
