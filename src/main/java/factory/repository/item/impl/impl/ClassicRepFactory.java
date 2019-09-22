package factory.repository.item.impl.impl;

import domain.item.impl.classic.Classic;
import repository.Irepository;
import repository.item.impl.impl.BeverageRep;
import repository.item.impl.impl.ClassicRep;

import java.util.ArrayList;

public class ClassicRepFactory{
public static ClassicRep getClassicRep(){
    return ClassicRep.getClassicRep();
}
}