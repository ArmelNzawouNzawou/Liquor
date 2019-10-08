package company.com.domain.customerPayment.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cash {
    @Id
    private String payment_id;
    private String customerNumber;
    private String orderNumber;
    private double amount;
    private String arrengement_id;

    private Cash() {
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getArrengement_id() {
        return arrengement_id;
    }

    public void setArrengement_id(String arrengement_id) {
        this.arrengement_id = arrengement_id;
    }

    @Override
    public String toString() {
        return  "  Cash" +
                "\ncustomerNumber:   " + customerNumber +
                "\norderNumber:      " + orderNumber +
                "\namount:           " + amount +
                "\npayment_type:     " + payment_id +
                "\narrengement_id:   " + arrengement_id ;
    }
    public static class Builder{
        private String customerNumber;
        private String orderNumber;
        private double amount;
        private String payment_id;
        private String arrengement_id;

        public Builder (String payment_id){
            this.payment_id=payment_id;
        }
        public Builder buildOrderNumber(String orderNumber){
            this.orderNumber=orderNumber;
            return this;
        }
        public Builder buildAmount(double amount){
            this.amount=amount;
            return this;
        }
        public Builder buildArrengementId(String arrengement_id){
            this.arrengement_id=arrengement_id;
            return this;
        }
        public Builder buildCustomerNumebr(String customerNumber){
            this.customerNumber=customerNumber;
            return this;
        }
        public Cash build(){
            Cash cash =new Cash();
            cash.amount=this.amount;
            cash.arrengement_id=this.arrengement_id;
            cash.customerNumber=this.customerNumber;
            cash.orderNumber=this.orderNumber;
            cash.payment_id=this.payment_id;
            return cash;
        }
    }
}
