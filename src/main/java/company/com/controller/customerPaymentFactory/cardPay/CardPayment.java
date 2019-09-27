package company.com.controller.customerPaymentFactory.cardPay;

import company.com.controller.ControllerInt;
import company.com.domain.customerPayment.impl.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.payment.customerPay.impl.CardRepService;

import java.util.ArrayList;
@RestController
@RequestMapping("/card")
public class CardPayment implements ControllerInt<Card,String> {
    @Autowired
    CardRepService cardRepService;
    @PostMapping("/create")
    @Override
    public Card create(@RequestBody Card card) {
        return cardRepService.create(card);
    }

    @GetMapping("/read")
    @Override
    public Card read(@RequestParam(value = "id")String id) {
        return cardRepService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id")String id) {
        cardRepService.delete(id);
    }

    @PostMapping("update")
    @Override
    public Card update(@RequestBody Card card) {
        return cardRepService.update(card);
    }

    @GetMapping("/reads")
    @Override
    public ArrayList<Card> readAll() {
        return cardRepService.readAlll();
    }
}
