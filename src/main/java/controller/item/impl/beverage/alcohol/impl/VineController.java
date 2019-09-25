package controller.item.impl.beverage.alcohol.impl;

import controller.ControllerInt;
import domain.item.impl.beverage.alcohol.Alcohol;
import domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import domain.item.impl.beverage.alcohol.impl.Beer;
import domain.item.impl.beverage.alcohol.impl.Vine;
import factory.domain.item.impl.beverage.alcohol.alcohol_bridge.Alcohol_ItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.beverage.alcohol.impl.VineService;
import service.item.impl.impl.AlcoholService;

import java.util.ArrayList;

@RestController
@RequestMapping("/vine")
public class VineController implements ControllerInt<Vine,String> {
    @Autowired
    VineService vineService;
    @Autowired
    AlcoholService alcoholService;

    @PostMapping("/create")
    @Override
    public Vine create(@RequestBody Vine vine) {
        Vine result =vineService.create(vine);
        Alcohol alcohol=alcoholService.read(result.getId());
        AlcoholItem alcoholItem= Alcohol_ItemFactory.getAlcoholItem(result.getId(),alcohol.getAlcohol_id(),vine.getName());
        return result;
    }

    @GetMapping("/read")
    @Override
    public Vine read(@RequestParam(value = "/id") String id) {
        return vineService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        vineService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Vine update(@RequestBody Vine vine) {
        return vineService.update(vine);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Vine> readAll() {
        return vineService.readAlll();
    }
}
