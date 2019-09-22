package repository.payment.customerPay.impl;

import domain.customerPayment.impl.Card;
import domain.orderTiming.OrderTiming;
import repository.payment.customerPay.CardInt;

import java.util.ArrayList;

public class CardRep implements CardInt {
    private static CardRep cardRep=null;
    private ArrayList<Card>mydb=new ArrayList<>();

    private CardRep() {
    }
    public static CardRep getCardRep(){
        if(cardRep==null){
            cardRep=new CardRep();
        }return cardRep;
    }

    @Override
    public Card create(Card card) {
        Card result=findCard(card.getPayment_id());
        if(result==null){
            mydb.add(card);
            return card;
        }
        return null;
    }

    @Override
    public Card update(Card card) {
        Card result=findCard(card.getPayment_id());
        if(result!=null){
            delete(result.getPayment_id());
            return create(card);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Card result=findCard(s);
        if(result!=null){
           mydb.remove(result);
        }
    }

    @Override
    public Card read(String s) {
        Card result=findCard(s);
        if(result!=null){

            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Card> readAll() {
        return mydb;
    }

    @Override
    public int getItemNumber() {
        return 0;
    }
    public Card findCard(String id){
        return mydb.stream()
                .filter(C ->C.getPayment_id().equals(id))
                .findAny()
                .orElse(null);
    }
}
