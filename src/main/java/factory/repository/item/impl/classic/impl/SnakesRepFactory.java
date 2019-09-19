package factory.repository.item.impl.classic.impl;

import domain.item.impl.classic.impl.Snakes;
import repository.Irepository;
import repository.item.impl.classic.impl.SnakesRep;

import java.util.ArrayList;

public class SnakesRepFactory{
    public static SnakesRep getSnakesRep(){
        return SnakesRep.getsnakesRep();
    }

}