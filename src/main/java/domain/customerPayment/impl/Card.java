package domain.customerPayment.impl;

public class Card {
    private String customerNumber;
    private String orderNumber;
    private String bankName;
    private String paymentDetaild;
    private double amount;
    private String payment_id;
    private String arrengement_id;

    private Card() {
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPaymentDetaild() {
        return paymentDetaild;
    }

    public void setPaymentDetaild(String paymentDetaild) {
        this.paymentDetaild = paymentDetaild;
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
        return "Card{" +
                "customerNumber='" + customerNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", bankName='" + bankName + '\'' +
                ", paymentDetaild='" + paymentDetaild + '\'' +
                ", amount=" + amount +
                ", payment_id='" + payment_id + '\'' +
                ", arrengement_id='" + arrengement_id + '\'' +
                '}';
    }

    public static class Builder{
        private String customerNumber;
        private String orderNumber;
        private double amount;
        private String payment_id;
        private String arrengement_id;
        private String bankName;
        private String paymentDetaild;

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
        public Builder buildbankName(String bankName){
            this.bankName=bankName;
            return this;
        }
        public Builder buildpaymentDetaild(String paymentDetaild){
            this.paymentDetaild=paymentDetaild;
            return this;
        }
        public Card build(){
            Card cash =new Card();
            cash.amount=this.amount;
            cash.arrengement_id=this.arrengement_id;
            cash.customerNumber=this.customerNumber;
            cash.orderNumber=this.orderNumber;
            cash.payment_id=this.payment_id;
            cash.bankName=this.bankName;
            cash.paymentDetaild=this.paymentDetaild;
            return cash;
        }
    }
}
