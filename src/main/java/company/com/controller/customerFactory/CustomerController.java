package company.com.controller.customerFactory;

import company.com.domain.bridge.Customer_address;
import company.com.domain.customerBuilder.Customer;
import company.com.domain.users.Address;
import company.com.factory.domain.address.AddressFactory;
import company.com.factory.domain.bridge.Customer_AddressFactory;
import company.com.factory.domain.customerFactory.CustomerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.address.Impl.AddressService;
import company.com.service.customerServ.impl.CustomerService;

import java.util.ArrayList;
@RestController
@RequestMapping("LDS/customer")
public class CustomerController  {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private AddressService addressService;


    @PostMapping("/create")
    public Customer create(@RequestBody Customer_address ca) {

        if(ca!=null){
            Customer cust= CustomerFactory.getCustomer(ca.getCustomer().getName(),ca.getCustomer().getSurName());
            Address ad= AddressFactory.getAddress(ca.getAddress().getEmailAddress(),ca.getAddress().getAddress(),ca.getAddress().getPhoner_Number());
            return customerService.create(cust);
        }
        return null;
    }

    @GetMapping("/read")
    public Customer_address read(@RequestParam(value = "id") String id) {
        Customer cust=customerService.read(id);
        Address ad=addressService.read(id);
        Customer_address custAdd= Customer_AddressFactory.getCustomerAddress(cust,ad);
        return custAdd ;
    }

    @GetMapping("/delete")
    public void delete(@RequestParam(value = "id") String id) {
        addressService.read(id);
        customerService.delete(id);
    }

    @PostMapping("/update")
    public Customer_address update(@RequestBody Customer_address customer) {
        Customer cust=customerService.update(customer.getCustomer());
        Address ad=addressService.update(customer.getAddress());
        Customer_address custAdd= Customer_AddressFactory.getCustomerAddress(cust,ad);
        return custAdd;
    }

    @GetMapping("/reads")
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
