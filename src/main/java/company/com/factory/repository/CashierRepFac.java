package company.com.factory.repository;


import company.com.repository.casher.impl.CashierRep;

public class CashierRepFac {
    private CashierRep cashierRep,cashierRe;
    public static CashierRep getCashier() {
        return  CashierRep.getCashierRep();
    }
}
