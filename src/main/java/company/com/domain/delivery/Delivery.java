package company.com.domain.delivery;

public class Delivery {
    private String deliveryNumber;
    private String orderNumber;
    private String customerNumber;
    private String cashierNumber;

    private Delivery() {
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCashierNumber() {
        return cashierNumber;
    }

    public void setCashierNumber(String cashierNumber) {
        this.cashierNumber = cashierNumber;
    }
    public static class Builder{
        private String deliveryNumber;
        private String orderNumber;
        private String customerNumber;
        private String cashierNumber;

        public Builder(String deliveryNumber){
            this.deliveryNumber=deliveryNumber;
        }
        public Builder buildOderNumber(String orderNumber){
            this.orderNumber=orderNumber;
            return this;
        }
        public Builder buildCustomerNumber(String customerNumber){
            this.customerNumber=customerNumber;
            return this;
        }
        public Builder buildCashierNumber(String cashierNumber){
            this.cashierNumber=cashierNumber;
            return this;
        }
        public Delivery build(){
            Delivery delivery=new Delivery();
            delivery.cashierNumber=this.cashierNumber;
            delivery.customerNumber=this.customerNumber;
            delivery.deliveryNumber=this.deliveryNumber;
            delivery.orderNumber=this.orderNumber;
            return delivery;
        }
    }
}
