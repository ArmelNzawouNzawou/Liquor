package controller.item.impl.beverage;
import controller.ControllerInt;
import domain.item.impl.beverage.Beverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.impl.BeverageService;

import java.util.ArrayList;

@RestController
@RequestMapping("/beverage")
public class BeverageController implements ControllerInt<Beverage,String> {

    @Autowired
    BeverageService beverageService;
    @PostMapping("/creat")
    @Override
    public Beverage create(@RequestBody Beverage beverage) {

        return beverageService.create(beverage);
    }
    @GetMapping("/read")
    @Override
    public Beverage read(@RequestParam(value = "id") String id) {
        return beverageService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        beverageService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public Beverage update(@RequestBody Beverage beverage) {
        return beverageService.update(beverage);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<Beverage> readAll() {
        return beverageService.readAlll();
    }
}
