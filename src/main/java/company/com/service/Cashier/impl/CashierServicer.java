package company.com.service.Cashier.impl;

import company.com.domain.cashierBuilderPack.Cashier;
import company.com.factory.repository.CashierRepFac;
import company.com.repository.casher.CahierInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import company.com.repository.casher.impl.CashierRep;
import company.com.service.Cashier.CashierServiceInt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CashierServicer implements CashierServiceInt {
    private static CashierServicer cashier=null;
    //CashierRep cashierRep= CashierRepFac.getCashier();
    @Autowired
    CahierInterface cahierInterface;

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

        return cahierInterface.save(cashierProduct);
    }

    @Override
    public Cashier update(Cashier cashierProduct) {

        Cashier mycashier=read(cashierProduct.getId());
        if(mycashier!=null){
            delete(cashierProduct.getId());
            return cahierInterface.save(cashierProduct);
        }return null;
    }

    @Override
    public void delete(String id) {
        cahierInterface.deleteById(id);
    }

    @Override
    public Cashier read(String id) {
        Optional<Cashier> myCashier=cahierInterface.findById(id);
        return myCashier.orElse(null);
    }

    @Override
    public List<Cashier> readAlll() {
        return cahierInterface.findAll();
    }
}
