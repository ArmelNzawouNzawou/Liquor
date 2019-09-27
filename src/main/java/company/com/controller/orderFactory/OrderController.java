package company.com.controller.orderFactory;
import company.com.controller.ControllerInt;
import company.com.domain.orderBuilder.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import company.com.service.orderServices.impl.OrderServices;

import java.util.ArrayList;

public class OrderController implements ControllerInt<Orders,String> {

    @Autowired
    OrderServices orderServices;

    @PostMapping("/create")
    @Override
    public Orders create(@RequestBody Orders order) {
        return orderServices.create(order);
    }
    @GetMapping("/read")
    @Override
    public Orders read(@RequestParam(value = "id") String id) {
        return orderServices.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id")String id) {

    }
    @PostMapping("/update")
    @Override
    public Orders update(@RequestBody Orders order) {
        return null;
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<Orders> readAll() {
        return null;
    }
}
