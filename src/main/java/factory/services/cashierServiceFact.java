package factory.services;

import com.service.Cashier.impl.CashierServicer;

public class cashierServiceFact {
    CashierServicer cashier;
    public CashierServicer getCashier(String s)
    {
        if(s.equalsIgnoreCase("cashierService"))
        {
            return cashier.getCashier();
        }
        else return null;
    }
}
