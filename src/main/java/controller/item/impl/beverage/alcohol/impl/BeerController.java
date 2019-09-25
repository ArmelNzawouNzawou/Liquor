package controller.item.impl.beverage.alcohol.impl;

import controller.ControllerInt;
import domain.item.impl.beverage.Beverage;
import domain.item.impl.beverage.alcohol.Alcohol;
import domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import domain.item.impl.beverage.alcohol.impl.Beer;
import factory.domain.item.impl.beverage.BeverageFactory;
import factory.domain.item.impl.beverage.alcohol.AlcoholFactory;
import factory.domain.item.impl.beverage.alcohol.alcohol_bridge.Alcohol_ItemFactory;
import factory.repository.item.impl.beverage.alcohol.impl.AlcoholItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.beverage.alcohol.alcoholBridge.AlcoholItemService;
import service.item.impl.beverage.alcohol.impl.BeerService;
import service.item.impl.impl.AlcoholService;
import service.item.impl.impl.BeverageService;
import service.item.impl.impl.ItemService;
import util.IdGenerator;

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
        return null;
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Beer> readAll() {
        return null;
    }
}
