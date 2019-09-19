package factory.domain.productFactory;

import com.domain.itemBuilder.classicItem.ClassiProductInterface;
import com.domain.itemDomain.classicItem.Cigarette;
import com.domain.itemDomain.classicItem.Ice;
import com.domain.itemDomain.classicItem.Snaks;

public class ClassicItemFactory {
    public ClassiProductInterface getClassicProduct(String s)
    {
        if(s.equalsIgnoreCase("cigaratte"))
        {
            return new Cigarette();
        }else if(s.equalsIgnoreCase("ice"))
        {
            return new Ice();
        }else if(s.equalsIgnoreCase("snaks"))
        {
            return new Snaks();
        }else return null;

    }
}
