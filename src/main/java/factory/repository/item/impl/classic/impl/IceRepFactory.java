package factory.repository.item.impl.classic.impl;

import domain.item.impl.classic.impl.Ice;
import repository.Irepository;
import repository.item.impl.classic.impl.IceRep;

import java.util.ArrayList;

public class IceRepFactory{
    public static IceRep getIceRep(){
        return IceRep.getIceRep();
    }
}