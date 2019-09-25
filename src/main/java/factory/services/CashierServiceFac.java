package factory.services;


import repository.casher.impl.CashierRep;
import service.Cashier.impl.CashierServicer;

public class CashierServiceFac {
    public static CashierServicer getCashier() {
        return  CashierServicer.getCashier();
    }
}
