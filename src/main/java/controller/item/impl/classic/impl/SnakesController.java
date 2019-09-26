package controller.item.impl.classic.impl;


import controller.ControllerInt;
import domain.item.impl.classic.impl.Snakes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.classic.impl.SnakesService;

import java.util.ArrayList;

@RestController
@RequestMapping("/snakes")
public class SnakesController implements ControllerInt<Snakes,String> {
    @Autowired
    SnakesService snakesService;

    @PostMapping("/create")
    @Override
    public Snakes create(@RequestBody Snakes snakes) {
        return snakesService.create(snakes);
    }
    @GetMapping("/read")
    @Override
    public Snakes read(@RequestParam(value = "id") String id) {
        return snakesService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        snakesService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Snakes update(@RequestBody Snakes snakes) {
        return snakesService.update(snakes);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Snakes> readAll() {
        return snakesService.readAlll();
    }
}
