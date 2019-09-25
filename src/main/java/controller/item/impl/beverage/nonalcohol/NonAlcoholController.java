package controller.item.impl.beverage.nonalcohol;

import controller.ControllerInt;
import domain.item.impl.beverage.alcohol.Alcohol;
import domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import domain.item.impl.beverage.nonalcohol.NonAlcohol;
import factory.domain.item.impl.beverage.alcohol.alcohol_bridge.Alcohol_ItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.beverage.alcohol.alcoholBridge.AlcoholItemService;
import service.item.impl.impl.BeverageService;
import service.item.impl.impl.NonAlcholService;

import java.util.ArrayList;

@RestController

public class NonAlcoholController implements ControllerInt<NonAlcohol,String> {

    @Autowired
    NonAlcholService nonAlcholService;
    @Autowired
    BeverageService beverageService;
    @Autowired
    AlcoholItemService alcoholItemService;

    @PostMapping("/creat")
    @Override
    public NonAlcohol create(@RequestBody NonAlcohol nonAlcohol) {
        String bevId=beverageService.getBev("nonalcohol").getBev_id();
        NonAlcohol result=nonAlcholService.create(nonAlcohol);
        AlcoholItem alcoholItem= Alcohol_ItemFactory.getAlcoholItem(result.getItem_id(),bevId,result.getNaturelPercentage());
        alcoholItemService.create(alcoholItem);

        return result;
    }
    @GetMapping("/read")
    @Override
    public NonAlcohol read(@RequestParam String id) {
        return nonAlcholService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam String id) {
        nonAlcholService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public NonAlcohol update(@RequestBody NonAlcohol nonAlcohol) {
        return nonAlcholService.update(nonAlcohol);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<NonAlcohol> readAll() {
        return nonAlcholService.readAlll();
    }
}
