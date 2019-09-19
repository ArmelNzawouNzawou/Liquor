package factory.domain.item.impl.classic.impl;
import com.domain.item.impl.classic.impl.Cigarate;

public class CigarateFactory {
    public static Cigarate getCigarate(String id, String name){
        return new Cigarate.Builder(id).buildName(name).build();
    }
}