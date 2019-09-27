package company.com.repository.item.impl.impl;

import company.com.domain.item.impl.classic.Classic;
import company.com.repository.item.ClassicInt;

import java.util.ArrayList;

public class ClassicRep implements ClassicInt {
    private ArrayList<Classic> mydb=new ArrayList<>();
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
        Classic result= findAlcohol(classic.getClissic_id());
        if(result==null){
            mydb.add(classic);
            return classic;
        }
        return null;
    }

    @Override
    public Classic update(Classic classic) {
        Classic result= findAlcohol(classic.getClissic_id());
        if(result!=null){
            delete(result.getClissic_id());
            return create(classic);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Classic result= findAlcohol(s);
        if(result!=null){
           mydb.remove(result);
        }

    }

    @Override
    public Classic read(String s) {
        Classic result= findAlcohol(s);
        if(result!=null){
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Classic> readAll() {
        return mydb;
    }


    public Classic findAlcohol(String id){
        return mydb.stream()
                .filter(C ->C.getClissic_id().equals(id))
                .findAny()
                .orElse(null);
    }
}
