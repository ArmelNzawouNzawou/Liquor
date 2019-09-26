package controller.customerFactory;

import controller.ControllerInt;
import domain.bridge.Customer_address;
import domain.customerBuilder.Customer;
import factory.domain.customerFactory.CustomerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.address.Impl.AddressService;
import service.customerServ.CustomerService;

import java.util.ArrayList;
@RestController
@RequestMapping("/customer")
public class CustomerController implements ControllerInt <Customer_address,String> {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private AddressService addressService;
    @PostMapping("/create")
    @Override
    public Customer_address create(@RequestBody Customer_address ca) {
        Customer cust= CustomerFactory.getCustomer(ca.)
        if(ca!=null){

        }
        return customerService.create(customer);
    }

    @GetMapping("/read")
    @Override
    public Customer_address read(@RequestParam(value = "id") String id) {
        return customerService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        customerService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Customer_address update(@RequestBody Customer_address customer) {
        return customerService.update(customer);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Customer_address> readAll() {
        return customerService.readAlll();
    }
    /** @Autowired
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
    }*/
}
