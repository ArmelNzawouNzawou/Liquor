package company.com.controller.customerPaymentFactory;

import company.com.controller.ControllerInt;
import company.com.domain.customerPayment.CustomerPay;
import company.com.domain.customerPayment.CustomerPaymentBridge;
import company.com.domain.customerPayment.impl.Card;
import company.com.domain.customerPayment.impl.Cash;
import company.com.factory.domain.customerFactory.card.CardFactory;
import company.com.factory.domain.customerFactory.cash.CashFactory;
import company.com.factory.domain.customerPaymentFactory.CustomerPayFactory;
import company.com.factory.domain.customerPaymentFactory.CustomerPaymentBridgeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.payment.customerPay.impl.CardRepService;
import company.com.service.payment.customerPay.impl.CashService;
import company.com.service.payment.customerPay.impl.CustomerPayService;

import java.util.ArrayList;

/**A VERIFIER
 * this class will give the frontend to choose either the customer can create a cash ,or card payment.
 */
@RestController
@RequestMapping("/customer/payment")
public class CustomerPayController  {
    private CustomerPaymentBridge custo;
    @Autowired
    private CustomerPayService customerPayService;
    @Autowired
    private CardRepService cardRepService;
    @Autowired
    private CashService cashService;


    @PostMapping("/create")
    public CustomerPaymentBridge create(@RequestBody CustomerPaymentBridge cp) {
        CustomerPay customerPay=null;
        String pay=null;
        //ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "CustomerPaymentBridge created!");

        if(cp.getPayType().equals("card")){
            Card card= CardFactory.getCard(cp.getCustomerNumber(),cp.getBankName(),cp.getPaymentDetaild(),cp.getAmount(),cp.getPayment_id(),cp.getArrengement_id()) ;
            customerPay= CustomerPayFactory.getCustomerPay(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getArrengement_id(),cp.getPayType());
            pay= card.toString();

        }else if(cp.getPayType().equals("cash")){

            customerPay= CustomerPayFactory.getCustomerPay(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getArrengement_id(),cp.getPayType());
            Cash cash= CashFactory.getCash(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getAmount(),cp.getPayment_id(),cp.getArrengement_id());

            cashService.create(cash);
            pay= cash.toString();
        }
        CustomerPaymentBridge CPB=CustomerPaymentBridgeFactory.getCustomerPaymentBridge(cp.getCustomerNumber(),cp.getOrderNumber(),cp.getAmount(),customerPay.getPayId(),"NONE",cp.getPayType(),"",pay);
         return CPB;
    }

    /**
     * the id here for now is the orderNuber number
     * @param orderNumber
     * @return
     */
    @GetMapping("/read")
    public CustomerPaymentBridge read(@RequestParam(value = "orderNumber")String orderNumber) {
        CustomerPay cust=customerPayService.findOrder(orderNumber);
        if(cust.getPayType().equalsIgnoreCase("cash"))
        {
            Cash cash=cashService.read(cust.getPayId());
            CustomerPaymentBridge toreturn=CustomerPaymentBridgeFactory.getCustomerPaymentBridge(cust.getCustomerNumber(),cust.getOrderNumber(),cash.getAmount(),cust.getPayId(),cash.getArrengement_id(),cust.getPayType()," "," ");
            return toreturn;
        }else  if(cust.getPayType().equalsIgnoreCase("card"))
        {
            Card card=cardRepService.read(orderNumber);
            CustomerPaymentBridge toreturn=CustomerPaymentBridgeFactory.getCustomerPaymentBridge(cust.getCustomerNumber(),cust.getOrderNumber(),card.getAmount(),cust.getPayId(),card.getArrengement_id(),cust.getPayType(),card.getBankName(),card.getPaymentDetaild());
            return toreturn;
        }
        return null;
    }

    @GetMapping("/delete")
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
    public CustomerPaymentBridge update(@RequestBody CustomerPaymentBridge customerPaymentBridge) {
        return null;
    }

    @GetMapping("reads")
    public ArrayList<CustomerPaymentBridge> readAll() {

        return null;
    }
    public CustomerPay createCustomer(CustomerPay customerPay){
        return customerPayService.create(customerPay);

    }
}
