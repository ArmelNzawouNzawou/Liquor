package controller.cashier;

import com.domain.cashierBuilderPack.CashierProduct;
import com.service.Cashier.impl.CashierServicer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Component
@RequestMapping("/cashier")
public class CashierController {


    CashierServicer cashierServicer;
    @GetMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CashierProduct create(@RequestParam CashierProduct product)
    {
        return cashierServicer.create(product);
    }

    @GetMapping("/read/{id}")
    public CashierProduct read(@PathVariable(value = "id") String Id)
    {
        return cashierServicer.read(Id);
    }

    @GetMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CashierProduct update(@RequestParam CashierProduct product)
    {
        return cashierServicer.update(product);
    }
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") String Id)
    {
        cashierServicer.delete(Id);
    }

    @RequestMapping("getAll")
    public ArrayList getAll()
    {
        return cashierServicer.readAlll();
    }
}
