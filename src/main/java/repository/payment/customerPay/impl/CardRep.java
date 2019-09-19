package repository.payment.customerPay.impl;

import domain.customerPayment.impl.Card;
import repository.payment.customerPay.CardInt;

import java.util.ArrayList;

public class CardRep implements CardInt {
    private static CardRep cardRep=null;

    private CardRep() {
    }
    public static CardRep getCardRep(){
        if(cardRep==null){
            cardRep=new CardRep();
        }return cardRep;
    }

    @Override
    public Card create(Card card) {
        return null;
    }

    @Override
    public Card update(Card card) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Card read(String s) {
        return null;
    }

    @Override
    public ArrayList<String> readAll(String type) {
        return null;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
}
