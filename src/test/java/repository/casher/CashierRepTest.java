package repository.casher;

import domain.cashierBuilderPack.Cashier;
import factory.domain.cashierFactory.CashierFactory;
import factory.repository.CashierRepFac;
import org.junit.Before;
import org.junit.Test;
import repository.casher.impl.CashierRep;

public class CashierRepTest {
    private Cashier cashier= CashierFactory.getCashier("espoir","diteke","12323");
    private CashierRep cashierRep= CashierRepFac.getCashier();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        System.out.println(cashierRep.create(cashier).toString());
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