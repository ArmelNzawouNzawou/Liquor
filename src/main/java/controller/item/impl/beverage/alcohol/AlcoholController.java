package controller.item.impl.beverage.alcohol;

import domain.item.impl.beverage.alcohol.Alcohol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.item.impl.impl.AlcoholService;

@RestController
@RequestMapping("/alcohol")
public class AlcoholController {
    @Autowired
    AlcoholService alcoholService;
    @PostMapping("/create")
    public Alcohol createALcohol(@RequestBody Alcohol alcohol){
        return alcoholService.create(alcohol);
    }
    public Alcohol readAlcohol(@RequestParam String id){
        return alcoholService.read(id);
    }
    public Alcohol update(@RequestBody Alcohol alcohol){
        return alcoholService.update(alcohol);
    }
    @GetMapping("/read")
    public Alcohol read(@RequestParam String id){
        return alcoholService.read(id);
    }

}
