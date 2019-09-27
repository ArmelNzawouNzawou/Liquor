package company.com.controller.address;

import company.com.controller.ControllerInt;
import company.com.domain.users.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.address.Impl.AddressService;

import java.util.ArrayList;

@RestController
@RequestMapping("/address")
public class AddressController implements ControllerInt<Address,String> {

    @Autowired
    private AddressService addressService;

    @PostMapping("/create")
    @Override
    public Address create(@RequestBody Address address) {
        return addressService.create(address);
    }

    @GetMapping("/read")
    @Override
    public Address read(@RequestParam(value = "id") String id) {
        return addressService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        addressService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Address update(@RequestBody Address address) {
        return addressService.update(address);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Address> readAll() {
        return addressService.readAlll();
    }
}
