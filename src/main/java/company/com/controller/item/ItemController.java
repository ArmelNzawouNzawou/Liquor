package company.com.controller.item;

import company.com.controller.ControllerInt;
import company.com.domain.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.item.impl.impl.ItemService;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
public class ItemController implements ControllerInt<Item,String> {
    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    @Override
    public Item create(Item item) {
        return itemService.create(item);
    }
    @GetMapping("/read")
    @Override
    public Item read(@RequestParam(value = "id") String id) {
        return itemService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        itemService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public Item update(@RequestBody Item item) {
        return itemService.update(item);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<Item> readAll() {
        return itemService.readAlll();
    }
}
