package controller.driver;

import controller.ControllerInt;
import domain.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.Driver.Impl.DriverService;

import java.util.ArrayList;

@RestController
@RequestMapping("/driver")
public class DriverContoller implements ControllerInt<Driver,String> {
    @Autowired
    DriverService driverService;

    @PostMapping("/create")
    @Override
    public Driver create(@RequestBody Driver driver) {
        return driverService.create(driver);
    }

    @GetMapping("/read")
    @Override
    public Driver read(@RequestParam(value = "id") String id) {
        return driverService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        driverService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Driver update(@RequestBody Driver driver) {
        return driverService.update(driver);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Driver> readAll() {
        return null;
    }
}
