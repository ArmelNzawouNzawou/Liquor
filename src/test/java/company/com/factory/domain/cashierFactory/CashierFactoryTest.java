package company.com.factory.domain.cashierFactory;

import company.com.domain.cashierBuilderPack.Cashier;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashierFactoryTest {
private Cashier cashier=CashierFactory.getCashier("noxolo","mabuka");
    @Test
    public void getCashier() {
        Assert.assertNotNull(cashier);
        System.out.println(cashier.toString());
    }
}