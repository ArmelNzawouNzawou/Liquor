package company.com.factory.services;


import company.com.service.Cashier.impl.CashierServicer;

public class CashierServiceFac {
    public static CashierServicer getCashier() {
        return  CashierServicer.getCashier();
    }
}
