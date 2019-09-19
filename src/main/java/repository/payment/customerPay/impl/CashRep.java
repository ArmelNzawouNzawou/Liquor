package repository.payment.customerPay.impl;


import domain.customerPayment.impl.Cash;
import repository.payment.customerPay.CashInt;

import java.sql.*;
import java.util.ArrayList;

public class CashRep implements CashInt {
    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private static CashRep cashRep = null;

    private CashRep() {
        try {
            this.conne = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static CashRep getCashRep() {
        if (cashRep == null) {
            cashRep = new CashRep();
        }
        return cashRep;
    }


    @Override
    public Cash create(Cash cash) {
        return null;
    }

    @Override
    public Cash update(Cash cash) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Cash read(String s) {
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
