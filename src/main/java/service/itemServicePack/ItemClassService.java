package service.itemServicePack;

import com.domain.itemBuilder.beverages.noAlcoholProduct.NoAlcoholicProduct;
import com.factory.repository.NonAlcoholRepFact;
import com.repository.ItemRep.noAlcoholRepository.NoAlcoholRepositoryClass;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * THIS CLASS IS GOING TO BE USED BY MANY CLASSES THAT IMPLEMENT @ ItemInterface
 * so i need to specify what happens when is accessing thos class
 * in the way that the user must be derected to the proper item that the user want to create.
 */


@Service("ItemService")
public class ItemClassService implements itemServiceInt {

    private static ItemClassService itemClassService=null;
    NoAlcoholRepositoryClass noAl=NonAlcoholRepFact.getRepNonAlco();

    private ItemClassService() {
    }

    public static ItemClassService getItemService()
    {
        if(itemClassService==null)
        {
            itemClassService=new ItemClassService();
        }
        return itemClassService;
    }


    @Override
    public NoAlcoholicProduct create(NoAlcoholicProduct noAlcoholicProduct) {
        return noAl.create(noAlcoholicProduct);
    }

    @Override
    public NoAlcoholicProduct update(NoAlcoholicProduct noAlcoholicProduct) {
        return noAl.update(noAlcoholicProduct);
    }

    @Override
    public void delete(String id) {
        noAl.delete(id);
    }

    @Override
    public NoAlcoholicProduct read(String id) {
        return noAl.read(id);
    }

    @Override
    public ArrayList readAlll() {
        return noAl.getAll();
    }
}
