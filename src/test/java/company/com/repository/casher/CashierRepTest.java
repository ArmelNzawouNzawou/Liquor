package company.com.repository.casher;

import company.com.domain.cashierBuilderPack.Cashier;
import company.com.factory.domain.cashierFactory.CashierFactory;
import company.com.factory.repository.CashierRepFac;
import org.junit.Before;
import org.junit.Test;
import company.com.repository.casher.impl.CashierRep;
import org.springframework.beans.factory.annotation.Autowired;

public class CashierRepTest {
    @Autowired
    CahierInterface  cashierRep;
    private Cashier cashier= CashierFactory.getCashier("diteke","mbuyi");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        System.out.println(cashier);
        System.out.println(cashierRep.save(cashier).toString());
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void readAll() {
    }

    @Test
    public void getItemNumber() {
    }

    @Test
    public void getAll() {
    }
}