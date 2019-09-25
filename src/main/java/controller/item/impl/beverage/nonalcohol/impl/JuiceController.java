package controller.item.impl.beverage.nonalcohol.impl;

import controller.ControllerInt;
import domain.item.impl.beverage.nonalcohol.impl.Juice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.beverage.nonalcohol.impl.JuiceService;

import java.util.ArrayList;

@RestController
@RequestMapping("/juice")
public class JuiceController implements ControllerInt<Juice,String> {

    @Autowired
    JuiceService juiceService;

    @PostMapping("/creat")
    @Override
    public Juice create(@RequestBody Juice juice) {
        return juiceService.create(juice);
    }

    @GetMapping("/read")
    @Override
    public Juice read(@RequestParam(value = "id") String id) {
        return juiceService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam("id") String id) {
        juiceService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Juice update(@RequestBody Juice juice) {
        return juiceService.update(juice);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Juice> readAll() {
        return juiceService.readAlll();
    }
}
