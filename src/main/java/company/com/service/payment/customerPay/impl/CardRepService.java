package company.com.service.payment.customerPay.impl;

import company.com.domain.customerPayment.impl.Card;
import company.com.factory.repository.CardRepFactory;
import company.com.repository.payment.customerPay.impl.CardRep;
import company.com.service.payment.customerPay.CardInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class CardRepService implements CardInt {
    private static CardRepService cardRep=null;
    private CardRep cardR= CardRepFactory.getCardRep();

    private CardRepService() {
    }
    public static CardRepService getCardRep(){
        if(cardRep==null){
            cardRep=new CardRepService();
        }return cardRep;
    }


    @Override
    public Card create(Card card) {
        return cardR.create(card);
    }

    @Override
    public Card update(Card card) {
        return cardR.update(card);
    }

    @Override
    public void delete(String id) {
        cardR.delete(id);
    }

    @Override
    public Card read(String id) {
        return cardR.read(id);
    }

    @Override
    public ArrayList<Card> readAlll() {
        return cardR.readAll();
    }
}
