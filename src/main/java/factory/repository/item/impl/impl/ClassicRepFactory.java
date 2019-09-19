package factory.repository.item.impl.impl;

import domain.item.impl.classic.Classic;
import repository.Irepository;
import repository.item.impl.impl.BeverageRep;

import java.util.ArrayList;

public class ClassicRepFactory{
public static BeverageRep getBeverageRep(){
    return BeverageRep.getBeverageRep();
}
}