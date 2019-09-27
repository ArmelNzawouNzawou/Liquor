package company.com.service.payment.customerPay.impl;


import company.com.domain.customerPayment.impl.Cash;
import company.com.factory.repository.CashRepFactory;
import company.com.repository.payment.customerPay.impl.CashRep;
import company.com.service.payment.customerPay.CashInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class CashService implements CashInt {

    private static CashService cashRep;
    private CashRep cashR= CashRepFactory.getCashRep();

    private CashService() {}


    public static CashService getCashRepService(){
        if (cashRep == null) {
            cashRep = new CashService();
        }
        return cashRep;
    }


    @Override
    public Cash create(Cash cash) {
        return cashR.create(cash);
    }

    @Override
    public Cash update(Cash cash) {
        return cashR.update(cash);
    }

    @Override
    public void delete(String id) {
        cashR.delete(id);
    }

    @Override
    public Cash read(String id) {
        return cashR.read(id);
    }

    @Override
    public ArrayList<Cash> readAlll() {
        return cashR.readAll();
    }
}
