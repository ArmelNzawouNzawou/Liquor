package controller.item.impl.classic.impl;


import domain.item.impl.classic.impl.Snakes;

public class SnakesFactory {
    public static Snakes getSnakes(String id, String name){
        return new Snakes.Builder(id).buildName(name).build();
    }
}
