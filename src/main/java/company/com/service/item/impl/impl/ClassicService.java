package company.com.service.item.impl.impl;

import company.com.domain.item.impl.classic.Classic;
import company.com.factory.repository.item.impl.impl.ClassicRepFactory;
import company.com.repository.item.impl.impl.ClassicRep;
import company.com.service.item.ClassicInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
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


}
