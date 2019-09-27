package company.com.domain.customerPayment;

public class CustomerPaymentBridge {
    private String customerNumber;
    private String orderNumber;
    private double amount;
    private String payment_id;
    private String arrengement_id;
    private String payType;
    private String bankName;
    private String paymentDetaild;

    private CustomerPaymentBridge() {
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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
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

    @Override
    public String toString() {
        return "CustomerPaymentBridge{" +
                "customerNumber='" + customerNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", amount=" + amount +
                ", payment_id='" + payment_id + '\'' +
                ", arrengement_id='" + arrengement_id + '\'' +
                ", payType='" + payType + '\'' +
                ", bankName='" + bankName + '\'' +
                ", paymentDetaild='" + paymentDetaild + '\'' +
                '}';
    }

    public static class Builder{
        private String payment_id;
        private String customerNumber;
        private String orderNumber;
        private double amount;
        private String arrengement_id;
        private String payType;
        private String bankName;
        private String paymentDetaild;

        public Builder(String payment_id){
            this.payment_id=payment_id;
        }
        public Builder buildCustomerId(String customerNumber){
            this.customerNumber=customerNumber;
            return this;
        }
        public Builder buildOrderNumber(String orderNumber){
            this.orderNumber=orderNumber;
            return this;
        }
        public Builder buildAmount(double amount){
            this.amount=amount;
            return this;
        }
        public Builder buildArrengement_id(String arrengement_id){
            this.arrengement_id=arrengement_id;
            return this;
        }
        public Builder buildPayType(String payType){
            this.payType=payType;
            return this;
        }
        public Builder buildBankName(String bankName){
            this.bankName=bankName;
            return this;
        }
        public Builder buildPaymentDetaild(String paymentDetaild){
            this.paymentDetaild=paymentDetaild;
            return this;
        }
        public CustomerPaymentBridge build(){
            CustomerPaymentBridge cust=new CustomerPaymentBridge();
            cust.payment_id=this.payment_id;
            cust.customerNumber=this.customerNumber;
            cust.orderNumber=this.orderNumber;
            cust.amount=this.amount;
            cust.arrengement_id=this.arrengement_id;
            cust.bankName=this.bankName;
            cust.payType=this.payType;
            cust.paymentDetaild=this.paymentDetaild;
            return cust;
        }
    }
}
