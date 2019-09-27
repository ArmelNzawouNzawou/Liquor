package company.com.controller.orderTiming;

import company.com.controller.ControllerInt;
import company.com.domain.orderLine.OrderLine;
import company.com.domain.orderTiming.OrderTiming;
import company.com.service.orderTime.impl.OrderTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.orderLine.impl.OrderLineService;

import java.util.ArrayList;
@RestController
@RequestMapping("/orderTime")
public class OrderTimingController implements ControllerInt<OrderTiming,String> {

    @Autowired
    OrderTimeService orderTimeService;
    @PostMapping("/create")
    @Override
    public OrderTiming create(@RequestBody OrderTiming orderLine) {
        return orderTimeService.create(orderLine);
    }
    @GetMapping("/read")
    @Override
    public OrderTiming read(@RequestParam(value = "id") String id) {
        return orderTimeService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        orderTimeService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public OrderTiming update(@RequestBody OrderTiming orderLine) {
        return orderTimeService.update(orderLine);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<OrderTiming> readAll() {
        return orderTimeService.readAlll();
    }
}
