package controller.item.impl.classic.impl;

import controller.ControllerInt;
import domain.item.impl.classic.impl.Cigarate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.classic.impl.CigarateService;

import java.util.ArrayList;

@RestController
@RequestMapping("/cigarate")
public class CigarateController implements ControllerInt<Cigarate,String> {
@Autowired
    CigarateService cigarateService;

    @PostMapping("/create")
    @Override
    public Cigarate create(@RequestBody Cigarate cigarate) {
        return cigarateService.create(cigarate);
    }
    @GetMapping("/read")
    @Override
    public Cigarate read(@RequestParam(value = "id") String id) {
        return cigarateService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam String id) {
        cigarateService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public Cigarate update(@RequestBody Cigarate cigarate) {
        return cigarateService.update(cigarate);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<Cigarate> readAll() {
        return null;
    }
}