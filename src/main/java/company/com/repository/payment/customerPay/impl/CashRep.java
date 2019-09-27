package company.com.repository.payment.customerPay.impl;


import company.com.domain.customerPayment.impl.Cash;
import company.com.repository.payment.customerPay.CashInt;

import java.util.ArrayList;

public class CashRep implements CashInt {
//    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
//    private String user="root";
//    private String password="";
//    private Connection conne;
    private ArrayList<Cash>mydb=new ArrayList<>();

    private static CashRep cashRep = null;

    private CashRep() {
//        try {
//            this.conne = DriverManager.getConnection(url, user, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public static CashRep getCashRep() {
        if (cashRep == null) {
            cashRep = new CashRep();
        }
        return cashRep;
    }


    @Override
    public Cash create(Cash cash) {
        Cash result=findCash(cash.getPayment_id());
        if(result==null){
            mydb.add(cash);
            return cash;
        }
        return null;
    }

    @Override
    public Cash update(Cash cash) {
        Cash result=findCash(cash.getPayment_id());
        if(result!=null){
            delete(result.getPayment_id());
            return create(cash);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Cash result=findCash(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public Cash read(String s) {
        Cash result=findCash(s);
        if(result!=null){
           return result;
        }
        return null;
    }

    @Override
    public ArrayList<Cash> readAll() {
        return mydb;
    }


    public Cash findCash(String id){
        return mydb.stream()
                .filter(C ->C.getPayment_id().equals(id))
                .findAny()
                .orElse(null);
    }
}
