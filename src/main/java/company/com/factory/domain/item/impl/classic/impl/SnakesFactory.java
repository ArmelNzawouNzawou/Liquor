package company.com.factory.domain.item.impl.classic.impl;


import company.com.domain.item.impl.classic.impl.Snakes;

public class SnakesFactory {
    public static Snakes getSnakes(String id, String name){
        return new Snakes.Builder(id).buildName(name).build();
    }
}
