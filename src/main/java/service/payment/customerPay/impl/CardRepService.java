package service.payment.customerPay.impl;

import domain.customerPayment.impl.Card;
import factory.repository.CardRepFactory;
import repository.payment.customerPay.impl.CardRep;
import service.payment.customerPay.CardInt;

import java.util.ArrayList;

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
