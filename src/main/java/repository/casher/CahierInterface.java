package repository.casher;


import domain.cashierBuilderPack.Cashier;
import repository.Irepository;
import java.util.ArrayList;

public interface CahierInterface extends Irepository<Cashier,String> {
   public ArrayList<Cashier> getAll();
}
