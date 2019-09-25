package controller.item.impl.beverage.nonalcohol.impl;


import controller.ControllerInt;
import domain.item.impl.beverage.nonalcohol.impl.CoolDrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.item.impl.beverage.nonalcohol.impl.CooledrinkService;

import java.util.ArrayList;

@Controller
@RequestMapping("/cooldrink")
public class CoolController implements ControllerInt<CoolDrink,String> {
    @Autowired
    CooledrinkService cooledrinkService;

    @PostMapping("/creat")
    @Override
    public CoolDrink create(@RequestBody CoolDrink coolDrink) {
        return cooledrinkService.create(coolDrink);
    }

    @GetMapping("/read")
    @Override
    public CoolDrink read(@RequestParam(value = "id") String id) {
        return cooledrinkService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestBody String id) {
        cooledrinkService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public CoolDrink update(@RequestBody CoolDrink coolDrink) {
        return cooledrinkService.update(coolDrink);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<CoolDrink> readAll() {
        return null;
    }
}
