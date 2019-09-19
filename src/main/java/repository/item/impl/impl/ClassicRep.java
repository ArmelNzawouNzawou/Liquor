package repository.item.impl.impl;

import domain.item.impl.classic.Classic;
import repository.item.ClassicInt;

import java.util.ArrayList;

public class ClassicRep implements ClassicInt {
    private static ClassicRep classicRep=null;

    private ClassicRep() {
    }
    public static ClassicRep getClassicRep(){
        if(classicRep==null){
            classicRep=new ClassicRep();
    }return classicRep;
    }


    @Override
    public Classic create(Classic classic) {
        return null;
    }

    @Override
    public Classic update(Classic classic) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Classic read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
