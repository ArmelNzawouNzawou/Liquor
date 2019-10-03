package company.com.domain.customerDelivery;

import java.util.ArrayList;

public class CustomerDelivery {
    private String OrderId;
    private String customerNumber;
    private String orderTime;
    private String comment;
    //private String itemNumber

    private CustomerDelivery() {
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }


    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CustomerDelivery{" +
                "OrderId='" + OrderId + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
    public static class Builder{
        private String OrderId;
        private String customerNumber;
        private String orderTime;
        private String comment;
        public Builder(String customerNumber){
            this.customerNumber=customerNumber;
        }
        public Builder buildOrderId(String orderId){
            this.OrderId=orderId;
            return this;
        }
        public Builder buildOrdertTime(String orderId){
            this.orderTime=orderId;
            return this;
        }
        public Builder buildComment(String comment){
            this.comment=comment;
            return this;
        }

        public CustomerDelivery build(){
            CustomerDelivery cust=new CustomerDelivery();
            cust.comment=this.comment;
            cust.customerNumber=this.customerNumber;
            cust.OrderId=this.OrderId;
            cust.orderTime=this.orderTime;
            return cust;
        }
    }
}
