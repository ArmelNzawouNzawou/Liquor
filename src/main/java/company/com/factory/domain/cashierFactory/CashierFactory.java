package company.com.factory.domain.cashierFactory;
import company.com.domain.cashierBuilderPack.Cashier;
import company.com.util.IdGenerator;

public class CashierFactory {
  public static Cashier getCashier(String email,String name, String surName){
      return new Cashier
              .Builder(email)
              .buildName(name)
              .buildSurname(surName)
              .build();
  }
}
