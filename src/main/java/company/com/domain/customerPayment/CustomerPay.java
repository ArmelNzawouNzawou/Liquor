package company.com.domain.customerPayment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerPay {
    @Id
    private String payId;
    private String customerNumber;
    private String orderNumber;
    private String payType;
    private String Description;

    private CustomerPay() {
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Override
    public String toString() {
        return "CustomerPay{" +
                "customerNumber='" + customerNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", payId='" + payId + '\'' +
                ", payType='" + payType + '\'' +
                '}';
    }
    public static class Builder{
        private String customerNumber;
        private String orderNumber;
        private String payId;
        private String payType;
        private String Description;


        public Builder(String customerNumber) {
            this.customerNumber = customerNumber;
        }
        public Builder buildOrderNumber(String orderNumber){
            this.orderNumber=orderNumber;
            return this;
        }
        public Builder buildDescription(String description){
            this.Description=description;
            return this;
        }
        public Builder buildPayId(String payId){
            this.payId=payId;
            return this;
        }
        public Builder buildPayType(String payType){
            this.payType=payType;
            return this;
        }
        public CustomerPay build(){
            CustomerPay cust=new CustomerPay();
            cust.customerNumber=this.customerNumber;
            cust.orderNumber=this.orderNumber;
            cust.payId=this.payId;
            cust.payType=this.payType;
            cust.Description=this.Description;
            return cust;
        }
    }
}
