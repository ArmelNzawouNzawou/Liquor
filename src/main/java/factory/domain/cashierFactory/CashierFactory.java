package factory.domain.cashierFactory;
import domain.cashierBuilderPack.Cashier;

public class CashierFactory {
  public static Cashier getCashier(String name, String surName, int id){
      return new Cashier
              .Builder(id)
              .buildName(name)
              .buildSurname(surName)
              .build();
  }
}
