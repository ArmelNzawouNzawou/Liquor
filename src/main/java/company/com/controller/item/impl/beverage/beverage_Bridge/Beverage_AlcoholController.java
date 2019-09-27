package company.com.controller.item.impl.beverage.beverage_Bridge;

import company.com.controller.ControllerInt;
import company.com.domain.item.impl.beverage.beverage_Bridge.Beverage_Alcohol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.item.impl.beverage.beverage_Bridge.impl.Beverage_AlcoholServ;
import company.com.service.item.impl.impl.ItemService;

import java.util.ArrayList;

/**
 * a bridge class between beverage and all the Alcohole Item
 * when you are creating a beverage you must have the type of the item it is
 */
@RestController
@RequestMapping("/beverage/alcohol")
public class Beverage_AlcoholController implements ControllerInt<Beverage_Alcohol,String> {

    @Autowired
    Beverage_AlcoholServ beverage_alcoholServ;
    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    @Override
    public Beverage_Alcohol create(@RequestBody Beverage_Alcohol beverage_alcohol) {

        //String itemId=itemService.read();
        String beverageId=beverage_alcohol.getItem_id();

        return beverage_alcoholServ.create(beverage_alcohol);
    }

    @GetMapping("/read")
    @Override
    public Beverage_Alcohol read(@RequestParam(value = "id") String id) {
        return beverage_alcoholServ.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        beverage_alcoholServ.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Beverage_Alcohol update(@RequestBody Beverage_Alcohol beverage_alcohol) {
        return beverage_alcoholServ.update(beverage_alcohol);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Beverage_Alcohol> readAll() {
        return beverage_alcoholServ.readAlll();
    }
}
