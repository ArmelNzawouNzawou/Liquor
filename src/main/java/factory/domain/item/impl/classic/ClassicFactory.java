package factory.domain.item.impl.classic;
import domain.item.impl.classic.Classic;
import util.IdGenerator;

public class ClassicFactory {
   public static Classic getClassic( String color, String item_id){
        return new Classic.Builder(IdGenerator.getSuffixFromClassName(Classic.class))
                .buildColor(color)
                .buildItemId(item_id)
                .build();
    }
    public static Classic updateClassic(String clissic_id, String color, String item_id){
        return new Classic.Builder(clissic_id)
                .buildColor(color)
                .buildItemId(item_id)
                .build();
    }

}
