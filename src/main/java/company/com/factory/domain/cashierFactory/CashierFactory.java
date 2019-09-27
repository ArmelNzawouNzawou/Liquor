package company.com.factory.domain.cashierFactory;
import company.com.domain.cashierBuilderPack.Cashier;
import company.com.util.IdGenerator;

public class CashierFactory {
  public static Cashier getCashier(String name, String surName){
      return new Cashier
              .Builder(IdGenerator.getSuffixFromClassName(Cashier.class))
              .buildName(name)
              .buildSurname(surName)
              .build();
  }
    public static Cashier updateCashier(String id,String name, String surName){
        return new Cashier
                .Builder(id)
                .buildName(name)
                .buildSurname(surName)
                .build();
    }
}
