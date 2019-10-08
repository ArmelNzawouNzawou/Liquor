package company.com.domain.orderBuilder;


import javax.persistence.Entity;
import javax.persistence.Id;

/***this is the product class*/
@Entity
public class Orders {
    @Id
    private String orderNumeber;
    private String customerNumber;
    private String orderTime;
    private String comment;

    private Orders() {
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOrderNumeber() {
        return orderNumeber;
    }

    public void setOrderNumeber(String orderNumeber) {
        this.orderNumeber = orderNumeber;
    }

    public String isOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderCompleted) {
        this.orderTime = orderCompleted;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "orderNumeber='" + orderNumeber + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public static class Builder {
        private String orderNumeber;
        private String orderTime;
        private String comment;
        private String customerNumber;

        public Builder buildCustomer(String customerNumber){
            this.customerNumber=customerNumber;
            return this;
        }

        public Builder(String orderNumeber) {
            this.orderNumeber = orderNumeber;
        }

        public Builder buildOrderTime(String orderTime){
            this.orderTime=orderTime;
            return this;
        }


        public Builder buildComment(String comment){
            this.comment=comment;
            return this;
        }
        public Orders build(){
            Orders orders=new Orders();
            orders.orderNumeber=this.orderNumeber;
            orders.comment=this.comment;
            orders.orderTime=this.orderTime;
            return orders;
        }
    }
}



