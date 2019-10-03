package company.com.controller.customerDelivery;

import company.com.controller.ControllerInt;
import company.com.domain.customerDelivery.CustomerDelivery;
import company.com.domain.orderBuilder.Orders;
import company.com.domain.orderLine.OrderLine;
import company.com.factory.domain.orderFactory.OrderFacto;
import company.com.factory.domain.orderLine.OrderLineFactory;
import company.com.service.orderLine.impl.OrderLineService;
import company.com.service.orderServices.impl.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("LDS/customerorder")
public class CustomerDeveliveryController implements ControllerInt<CustomerDelivery,String> {
@Autowired
    OrderServices orderServices;
@Autowired
    OrderLineService orderLineService;

    @PostMapping("/create")
    @Override
    public CustomerDelivery create(@RequestBody CustomerDelivery cus) {
        Orders orders= OrderFacto.getOrders(cus.getCustomerNumber(),cus.getOrderTime(),cus.getComment());


        return null;
    }

    @Override
    public CustomerDelivery read(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public CustomerDelivery update(CustomerDelivery customerDelivery) {
        return null;
    }

    @Override
    public ArrayList<CustomerDelivery> readAll() {
        return null;
    }
}
