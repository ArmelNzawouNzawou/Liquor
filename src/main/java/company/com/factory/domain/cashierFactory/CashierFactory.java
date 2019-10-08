package company.com.factory.domain.cashierFactory;
import company.com.domain.cashierBuilderPack.Cashier;
import company.com.util.IdGenerator;

public class CashierFactory {
  public static Cashier getCashier(String name, String surName){
      return new Cashier
              .Builder("err")
              .buildName(name)
              .buildSurname(surName)
              .build();
  }
}
