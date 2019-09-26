package controller.item.impl.classic;
import controller.ControllerInt;
import domain.item.impl.ItemBridge.Item_beverage;
import domain.item.impl.classic.Classic;
import factory.domain.item.impl.beverage.beverage_Bridge.Item_BeverageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.beverage.beverage_Bridge.impl.Item_BeverageServ;
import service.item.impl.impl.ClassicService;
import service.item.impl.impl.ItemService;

import java.util.ArrayList;

@RestController
@RequestMapping("/classic")
public class ClassicController implements ControllerInt<Classic,String> {
@Autowired
    ClassicService classicService;
@Autowired
    ItemService itemService;
@Autowired
    Item_BeverageServ item_beverageServ;

    /**
     * this methode will need to first create a new classic item
     * it must read from item repository to get id of an indicated branch of the item
     * that the user want to create.
     * @param classic
     * @return
     */
    @PostMapping("/create")
    @Override
    public Classic create(@RequestBody Classic classic) {
        Classic classicId=classicService.create(classic);
        String itemId=itemService.getItem("classic").getId();
        if(itemId!=null&&classic!=null){
          Item_beverage result= Item_BeverageFactory.getItem_beverage(itemId,classicId.getClissic_id(),classic.getColor());
            item_beverageServ.create(result);
            return classicId;
        }

        return null;
    }

    @GetMapping("/read")
    @Override
    public Classic read(@RequestParam("id")String id) {
        return classicService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam("id")String id) {

    }

    @PostMapping("/update")
    @Override
    public Classic update(@RequestBody Classic classic) {
        return classicService.update(classic);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Classic> readAll() {
        return classicService.readAll();
    }
}
