package controller.customerPaymentFactory.cashPay;

import controller.ControllerInt;
import domain.customerPayment.impl.Cash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.payment.customerPay.impl.CashService;

import java.util.ArrayList;

@RestController
@RequestMapping("/cash")
public class CashPayment implements ControllerInt<Cash,String> {
    @Autowired
    CashService cashService;
    @PostMapping("/creat")
    @Override
    public Cash create(@RequestBody Cash cash) {
        return cashService.create(cash);
    }

    @GetMapping("/read")
    @Override
    public Cash read(@RequestParam(value = "id") String id) {
        return cashService.read(id);
    }
    @GetMapping("/read")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        cashService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Cash update(@RequestBody Cash cash) {
        return cashService.update(cash);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Cash> readAll() {
        return cashService.readAlll();
    }
}
