package company.com.factory.domain.item.impl.classic.impl;


import company.com.domain.item.impl.classic.impl.Chips;

public class ChipsFactory {
    public static Chips getChips(String id, String name){
        return new Chips.Builder(id).buildName(name).build();
    }
}
