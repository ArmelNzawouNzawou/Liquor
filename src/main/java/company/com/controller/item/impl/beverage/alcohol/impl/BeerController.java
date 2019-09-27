package company.com.controller.item.impl.beverage.alcohol.impl;

import company.com.controller.ControllerInt;
import company.com.domain.item.impl.beverage.alcohol.Alcohol;
import company.com.domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import company.com.domain.item.impl.beverage.alcohol.impl.Beer;
import company.com.factory.domain.item.impl.beverage.alcohol.alcohol_bridge.Alcohol_ItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.item.impl.beverage.alcohol.alcoholBridge.AlcoholItemService;
import company.com.service.item.impl.beverage.alcohol.impl.BeerService;
import company.com.service.item.impl.impl.AlcoholService;
import company.com.service.item.impl.impl.BeverageService;
import company.com.service.item.impl.impl.ItemService;

import java.util.ArrayList;

@RestController
@RequestMapping("/beer")
public class BeerController implements ControllerInt<Beer,String> {
    @Autowired
    ItemService itemService;
    @Autowired
    BeverageService beverageService;
    @Autowired
    AlcoholService alcoholService;
    @Autowired
    BeerService beerService;
    @Autowired
    AlcoholItemService alcoholItemService;

    @PostMapping("/create")
    @Override
    public Beer create(@RequestBody Beer beer){
        Beer result =beerService.create(beer);
        Alcohol alcohol=alcoholService.read(result.getId());
        AlcoholItem alcoholItem= Alcohol_ItemFactory.getAlcoholItem(result.getId(),alcohol.getAlcohol_id(),beer.getName());
        return result;
    }

    @GetMapping("/read")
    @Override
    public Beer read(@RequestParam(value = "id") String id) {
        return beerService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        beerService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Beer update(@RequestBody Beer beer) {
        return beerService.update(beer);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Beer> readAll() {
        return beerService.readAlll();
    }
}
