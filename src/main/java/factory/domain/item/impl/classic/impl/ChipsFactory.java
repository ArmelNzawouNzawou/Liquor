package factory.domain.item.impl.classic.impl;

import com.domain.item.impl.classic.impl.Chips;

public class ChipsFactory {
    public static Chips getChips(String id, String name){
        return new Chips.Builder(id).buildName(name).build();
    }
}
