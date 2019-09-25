package controller.customerPaymentFactory;

import controller.ControllerInt;
import domain.ResponseObj;
import domain.customerPayment.CustomerPay;
import domain.customerPayment.CustomerPaymentBridge;
import domain.customerPayment.impl.Card;
import domain.customerPayment.impl.Cash;
import factory.ResponseObjFactory;
import factory.domain.customerFactory.CustomerFactory;
import factory.domain.customerFactory.card.CardFactory;
import factory.domain.customerFactory.cash.CashFactory;
import factory.domain.customerPaymentFactory.CustomerPayFactory;
import factory.domain.customerPaymentFactory.CustomerPaymentBridgeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.payment.customerPay.impl.CardRepService;
import service.payment.customerPay.impl.CashService;
import service.payment.customerPay.impl.CustomerPayService;

import java.util.ArrayList;

/**
 * this class will give the frontend to choose either the customer can create a cash ,or card payment.
 */
@RestController
@RequestMapping("/customer/payment")
public class CustomerPayController implements ControllerInt<CustomerPaymentBridge,String> {
    private CustomerPaymentBridge custo;
    @Autowired
    private CustomerPayService customerPayService;
    @Autowired
    private CardRepService cardRepService;
    @Autowired
    private CashService cashService;


    @PostMapping("/create")
    @Override
    public CustomerPaymentBridge create(@RequestBody CustomerPaymentBridge cp) {
        CustomerPay customerPay=null;
        //ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "CustomerPaymentBridge created!");

        if(cp.getPayType().equals("card")){
        //    responseObj.setResponseDescription("Card Payment");
            Card card= CardFactory.getCard(cp.getCustomerNumber(),cp.getBankName(),cp.getPaymentDetaild(),cp.getAmount(),cp.getPayment_id(),cp.getArrengement_id()) ;
            customerPay= CustomerPayFactory.getCustomerPay(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getArrengement_id(),cp.getPayType());
            Cash cash= CashFactory.getCash("xxx","xxx",0,"xx","xxxx");

            CustomerPay customerPay_result=createCustomer(customerPay);
            cashService.create(cash);

            return cp;

        }else if(cp.getPayType().equals("cash")){
         //   responseObj.setResponseDescription("cash Payment");
           // Card card= CardFactory.getCard("xxx","xxxx","xxxx",0.00,"xxxx","xxx") ;
            customerPay= CustomerPayFactory.getCustomerPay(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getArrengement_id(),cp.getPayType());
            Cash cash= CashFactory.getCash(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getAmount(),cp.getPayment_id(),cp.getArrengement_id());

            cashService.create(cash);
            createCustomer(customerPay);

            return cp;
        } else return null;
/**
        Cash cash= CashFactory.getCash(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getAmount(),cp.getPayment_id(),cp.getArrengement_id());
        Card card= CardFactory.getCard(cp.getCustomerNumber(),cp.getBankName(),cp.getPaymentDetaild(),cp.getAmount(),cp.getPayment_id(),cp.getArrengement_id()) ;
        CustomerPay customerPay= CustomerPayFactory.getCustomerPay(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getArrengement_id(),cp.getPayType());

        customerPayService.create(customerPay);
        cardRepService.create(card);
        cashService.create(cash);
        return null;
 **/
    }

    /**
     * the id here for now is the customer number
     * @param id
     * @return
     */
    @GetMapping("/read")
    @Override
    public CustomerPaymentBridge read(@RequestParam(value = "id") String id) {
        CustomerPay cust=customerPayService.read(id);
        if(cust.getPayType().equalsIgnoreCase("cash"))
        {
            Cash cash=cashService.read(cust.getPayId());
            CustomerPaymentBridge toreturn=CustomerPaymentBridgeFactory.getCustomerPaymentBridge(cust.getCustomerNumber(),cust.getOrderNumber(),cash.getAmount(),cust.getPayId(),cash.getArrengement_id(),cust.getPayType()," "," ");
            return toreturn;
        }else  if(cust.getPayType().equalsIgnoreCase("card"))
        {
            Card card=cardRepService.read(id);
            CustomerPaymentBridge toreturn=CustomerPaymentBridgeFactory.getCustomerPaymentBridge(cust.getCustomerNumber(),cust.getOrderNumber(),card.getAmount(),cust.getPayId(),card.getArrengement_id(),cust.getPayType(),card.getBankName(),card.getPaymentDetaild());
            return toreturn;
        }
        return null;
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
       /*** CustomerPay cust=customerPayService.read(id);
        if(cust.getPayType().equalsIgnoreCase("cash"))
        {
            cashService.delete(cust.getPayId());
            customerPayService.read(id);
            CustomerPaymentBridge toreturn=CustomerPaymentBridgeFactory.getCustomerPaymentBridge(cust.getCustomerNumber(),cust.getOrderNumber(),cash.getAmount(),cust.getPayId(),cash.getArrengement_id(),cust.getPayType()," "," ");

        }else  if(cust.getPayType().equalsIgnoreCase("card"))
        {
            customerPayService.read(id);
            cardRepService.delete(cust.getPayId());
            CustomerPaymentBridge toreturn=CustomerPaymentBridgeFactory.getCustomerPaymentBridge(cust.getCustomerNumber(),cust.getOrderNumber(),card.getAmount(),cust.getPayId(),card.getArrengement_id(),cust.getPayType(),card.getBankName(),card.getPaymentDetaild());


        }*/

    }

    @PostMapping("/update")
    @Override
    public CustomerPaymentBridge update(@RequestBody CustomerPaymentBridge customerPaymentBridge) {
        return null;
    }

    @GetMapping("reads")
    @Override
    public ArrayList<CustomerPaymentBridge> readAll() {

        return null;
    }
    public CustomerPay createCustomer(CustomerPay customerPay){
        return customerPayService.create(customerPay);

    }
}
