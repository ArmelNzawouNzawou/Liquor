package service.classicService;

import domain.item.impl.classic.Classic;

import java.util.ArrayList;

public class ClassicService //implements ClassicServiceInt
{
    private static ClassicService classic;

    private ClassicService() {
    }
    public static ClassicService getClassic()
    {
        if(classic==null)
        {
            classic=new ClassicService();
        }return classic;
    }
/**
    @Override
    public Classic create(Classic classicProduct) {
        return classRep.create(classicProduct);
    }

    @Override
    public Classic update(Classic classicProduct) {
        return classRep.update(classicProduct);
    }

    @Override
    public void delete(String id) {
        classRep.delete(id);
    }

    @Override
    public Classic read(String id) {
        return classRep.read(id);
    }

    @Override
    public ArrayList readAlll() {
        return classRep.getAll();
    }
    */
}
