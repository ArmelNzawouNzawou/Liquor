package factory.repository.item.impl.classic.impl;

import domain.item.impl.classic.impl.Cigarate;
import repository.Irepository;
import repository.item.impl.classic.impl.CigarateRep;

import java.util.ArrayList;

public class CigarateRepFactory{
public static CigarateRep getCigarateRep(){
    return CigarateRep.getCigarateRep();
}
}