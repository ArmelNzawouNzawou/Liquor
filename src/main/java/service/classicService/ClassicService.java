package service.classicService;

import com.configPack.repositoryController.ClassicRepConfig;
import com.domain.itemBuilder.classicItem.ClassicProduct;
import com.repository.ItemRep.classicProducat.ClassicProductRep;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class ClassicService implements ClassicServiceInt {
    private static ClassicService classic;

    ApplicationContext ctx=new AnnotationConfigApplicationContext(ClassicRepConfig.class);
    ClassicProductRep classRep=(ClassicProductRep) ctx.getBean("getClassicRep");

    private ClassicService() {
    }
    public static ClassicService getClassic()
    {
        if(classic==null)
        {
            classic=new ClassicService();
        }return classic;
    }

    @Override
    public ClassicProduct create(ClassicProduct classicProduct) {
        return classRep.create(classicProduct);
    }

    @Override
    public ClassicProduct update(ClassicProduct classicProduct) {
        return classRep.update(classicProduct);
    }

    @Override
    public void delete(String id) {
        classRep.delete(id);
    }

    @Override
    public ClassicProduct read(String id) {
        return classRep.read(id);
    }

    @Override
    public ArrayList readAlll() {
        return classRep.getAll();
    }
}
