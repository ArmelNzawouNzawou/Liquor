package company.com.service.Cashier.impl;

import company.com.domain.cashierBuilderPack.Cashier;
import company.com.factory.repository.CashierRepFac;
import org.springframework.stereotype.Component;
import company.com.repository.casher.impl.CashierRep;
import company.com.service.Cashier.CashierServiceInt;

import java.util.ArrayList;

@Component
public class CashierServicer implements CashierServiceInt {
    private static CashierServicer cashier=null;
    CashierRep cashierRep= CashierRepFac.getCashier();


    private CashierServicer() {

    }

    public static CashierServicer getCashier() {
        if(cashier==null){
            cashier=new CashierServicer();
        }
        return cashier;
    }

    @Override
    public Cashier create(Cashier cashierProduct) {

        return cashierRep.create(cashierProduct);
    }

    @Override
    public Cashier update(Cashier cashierProduct) {

        return cashierRep.update(cashierProduct);
    }

    @Override
    public void delete(String id) {
        cashierRep.delete(id);
    }

    @Override
    public Cashier read(String id) {
        /**
         * we are reading from the database through the company.com.repository class
         * this method read returns an object a product that will help
         * create
         */

        /**
         * now we return the all cashier Object.
         */
        return cashierRep.read(id);
    }

    @Override
    public ArrayList<Cashier> readAlll() {
        return cashierRep.readAll();
    }
}
