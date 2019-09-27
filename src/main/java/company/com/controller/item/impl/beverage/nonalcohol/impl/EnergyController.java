package company.com.controller.item.impl.beverage.nonalcohol.impl;


import company.com.controller.ControllerInt;
import company.com.domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.item.impl.beverage.nonalcohol.impl.EnergyDrinkService;

import java.util.ArrayList;

@RestController
@RequestMapping("/energydrink")
public class EnergyController implements ControllerInt<EnergyDrink,String> {
    @Autowired
    EnergyDrinkService energyDrinkService;

    @PostMapping("/create")
    @Override
    public EnergyDrink create(@RequestBody EnergyDrink energyDrink) {
        return energyDrinkService.create(energyDrink);
    }

    @GetMapping("/read")
    @Override
    public EnergyDrink read(@RequestParam(value = "id") String id) {
        return energyDrinkService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam("id") String id) {
        energyDrinkService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public EnergyDrink update(@RequestBody EnergyDrink energyDrink) {
        return energyDrinkService.update(energyDrink);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<EnergyDrink> readAll() {
        return energyDrinkService.readAlll();
    }
}
