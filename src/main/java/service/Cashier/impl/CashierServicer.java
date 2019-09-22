package service.Cashier.impl;

import domain.cashierBuilderPack.Cashier;
import factory.repository.CashierRepFac;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.casher.impl.CashierRep;
import service.Cashier.CashierServiceInt;

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
         * we are reading from the database through the repository class
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
