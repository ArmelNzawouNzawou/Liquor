package company.com.domain.customerDelivery;

import java.util.ArrayList;

public class CustomerDelivery {
    private String OrderId;
    private ArrayList<String> itemID;
    private String customerNumber;
    private String orderTime;
    private String comment;
    private ArrayList<Integer> quatity;
    private String itemName;
    private String itemSize;
    private CustomerDelivery() {
    }

    public ArrayList<Integer> getQuatity() {
        return quatity;
    }

    public void setQuatity(ArrayList<Integer> quatity) {
        this.quatity = quatity;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public ArrayList<String> getItemID() {
        return itemID;
    }

    public void setItemID(ArrayList<String> itemID) {
        this.itemID = itemID;
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
                ", itemID=" + itemID +
                ", customerNumber='" + customerNumber + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", comment='" + comment + '\'' +
                ", quatity='" + quatity + '\'' +
                '}';
    }

    public static class Builder{
        private String OrderId;
        private ArrayList<String> itemID;
        private String customerNumber;
        private String orderTime;
        private String comment;
        private ArrayList<Integer> quatity;

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
        public Builder buildItemId(ArrayList<String> itemID){
            this.itemID=itemID;
            return this;
        }
        public Builder buildQuantity(ArrayList<Integer> quatity){
            this.quatity=quatity;
            return this;
        }
        public CustomerDelivery build(){
            CustomerDelivery cust=new CustomerDelivery();
            cust.comment=this.comment;
            cust.customerNumber=this.customerNumber;
            cust.itemID=this.itemID;
            cust.OrderId=this.OrderId;
            cust.orderTime=this.orderTime;
            return cust;
        }
    }
}
