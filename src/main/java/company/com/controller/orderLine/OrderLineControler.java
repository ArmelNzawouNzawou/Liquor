package company.com.controller.orderLine;

import company.com.controller.ControllerInt;
import company.com.domain.orderLine.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.orderLine.impl.OrderLineService;

import java.util.ArrayList;

@RestController
@RequestMapping("/orderline")
public class OrderLineControler implements ControllerInt<OrderLine,String> {

    @Autowired
    OrderLineService orderLineService;

    @PostMapping("/Create")
    @Override
    public OrderLine create(@RequestBody OrderLine orderLine) {
        return orderLineService.create(orderLine);
    }
    @GetMapping("/read")
    @Override
    public OrderLine read(@RequestParam(value = "id") String id) {
        return orderLineService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        orderLineService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public OrderLine update(@RequestBody OrderLine orderLine) {
        return orderLineService.update(orderLine);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<OrderLine> readAll() {
        return orderLineService.readAlll();
    }
}
