package controller.customerFactory;

import controller.ControllerInt;
import domain.customerBuilder.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.customerServ.CustomerService;

import java.util.ArrayList;
@RestController
@RequestMapping("/customer")
public class CustomerFactory implements ControllerInt<Customer,String> {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    @Override
    public Customer create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @GetMapping("/read")
    @Override
    public Customer read(@RequestParam(value = "id") String id) {
        return customerService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        customerService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Customer> readAll() {
        return customerService.readAlll();
    }
}
