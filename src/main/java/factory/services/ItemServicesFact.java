package factory.services;

import com.service.itemServicePack.ItemClassService;

public class ItemServicesFact {
    private ItemClassService itemClassService;

    public ItemClassService getItemClassService(String s) {
        if(s.equalsIgnoreCase("itemServices"))
        {
            return itemClassService.getItemService();
        }else return null;
    }
}
