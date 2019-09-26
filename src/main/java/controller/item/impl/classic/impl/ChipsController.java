package controller.item.impl.classic.impl;

import controller.ControllerInt;
import domain.item.impl.classic.impl.Chips;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.classic.impl.ChipsService;

import java.util.ArrayList;

@RestController
@RequestMapping("/chips")
public class ChipsController implements ControllerInt<Chips,String> {
    @Autowired
    ChipsService chipsService;
    @PostMapping("/create")
    @Override
    public Chips create(@RequestBody Chips chips) {
        return chipsService.create(chips);
    }
    @GetMapping("/read")
    @Override
    public Chips read(@RequestParam(value = "id") String id) {
        return chipsService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam("id") String id) {
        chipsService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public Chips update(@RequestBody Chips chips) {
        return chipsService.update(chips);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<Chips> readAll() {
        return chipsService.readAlll();
    }
}
