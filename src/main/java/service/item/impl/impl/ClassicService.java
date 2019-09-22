package service.item.impl.impl;

import domain.item.impl.classic.Classic;
import factory.repository.item.impl.impl.ClassicRepFactory;
import repository.item.impl.impl.ClassicRep;
import service.item.ClassicInt;

import java.util.ArrayList;

public class ClassicService implements ClassicInt {
private ClassicRep classicR= ClassicRepFactory.getClassicRep();
    private static ClassicService classicRep=null;

    private ClassicService() {
    }
    public static ClassicService getClassicRep(){
        if(classicRep==null){
            classicRep=new ClassicService();
    }return classicRep;
    }


    @Override
    public Classic create(Classic classic) {
        return classicR.create(classic);
    }

    @Override
    public Classic update(Classic classic) {
        return classicR.update(classic);
    }

    @Override
    public void delete(String s) {
        classicR.delete(s);
    }

    @Override
    public Classic read(String s) {
        return classicR.read(s);
    }

    @Override
    public ArrayList<Classic> readAll() {
        return classicR.readAll();
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
