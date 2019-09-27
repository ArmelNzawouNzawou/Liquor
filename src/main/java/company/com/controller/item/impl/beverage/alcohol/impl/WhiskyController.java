package company.com.controller.item.impl.beverage.alcohol.impl;

import company.com.controller.ControllerInt;
import company.com.domain.item.impl.beverage.alcohol.Alcohol;
import company.com.domain.item.impl.beverage.alcohol.alcoholBridge.AlcoholItem;
import company.com.domain.item.impl.beverage.alcohol.impl.Whisky;
import company.com.factory.domain.item.impl.beverage.alcohol.alcohol_bridge.Alcohol_ItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.item.impl.beverage.alcohol.impl.WhiskyService;
import company.com.service.item.impl.impl.AlcoholService;

import java.util.ArrayList;

@RestController
@RequestMapping("/whisky")
public class WhiskyController implements ControllerInt<Whisky,String> {
    @Autowired
    WhiskyService whiskyService;
    @Autowired
    AlcoholService alcoholService;

    @PostMapping("/read")
    @Override
    public Whisky create(@RequestBody Whisky whisky) {
        Whisky result =whiskyService.create(whisky);
        Alcohol alcohol=alcoholService.read(result.getId());
        AlcoholItem alcoholItem= Alcohol_ItemFactory.getAlcoholItem(result.getId(),alcohol.getAlcohol_id(),whisky.getName());

        return result;
    }

    @GetMapping("/read")
    @Override
    public Whisky read(@RequestParam(value = "id") String id) {
        return whiskyService.read(id);
    }

    @GetMapping("delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        whiskyService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Whisky update(@RequestBody Whisky whisky) {
        return whiskyService.update(whisky);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Whisky> readAll() {
        return whiskyService.readAlll();
    }
}
