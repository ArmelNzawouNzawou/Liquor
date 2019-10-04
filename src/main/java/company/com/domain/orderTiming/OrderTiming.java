package company.com.domain.orderTiming;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderTiming {
    @Id
    private String OrderNumber;
    private String timeOfPlacing;
    private String timeOfPickUp;
    private String timeOfComplition;
    private String description;

    private OrderTiming() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getTimeOfPlacing() {
        return timeOfPlacing;
    }

    public void setTimeOfPlacing(String timeOfPlacing) {
        this.timeOfPlacing = timeOfPlacing;
    }

    public String getTimeOfPickUp() {
        return timeOfPickUp;
    }

    public void setTimeOfPickUp(String timeOfPickUp) {
        this.timeOfPickUp = timeOfPickUp;
    }

    public String getTimeOfComplition() {
        return timeOfComplition;
    }

    public void setTimeOfComplition(String timeOfComplition) {
        this.timeOfComplition = timeOfComplition;
    }

    @Override
    public String toString() {
        return "OrderTiming{" +
                "OrderNumber='" + OrderNumber + '\'' +
                ", timeOfPlacing='" + timeOfPlacing + '\'' +
                ", timeOfPickUp='" + timeOfPickUp + '\'' +
                ", timeOfComplition='" + timeOfComplition + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String OrderNumber;
        private String timeOfPlacing;
        private String timeOfPickUp;
        private String timeOfComplition;
        private String description;

        public Builder(String orderNumber){
            this.OrderNumber=orderNumber;
        }
        public Builder buildTPlacing(String timeOfPlacing){
            this.timeOfPlacing=timeOfPlacing;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Builder buildTPickUp(String timeOfPickUp){
            this.timeOfPickUp=timeOfPickUp;
            return this;
        }
        public Builder buildTComplition(String timeOfComplition){
            this.timeOfComplition=timeOfComplition;
            return this;
        }
        public OrderTiming build(){
            OrderTiming orderTiming=new OrderTiming();
            orderTiming.OrderNumber=this.OrderNumber;
            orderTiming.timeOfComplition=this.timeOfComplition;
            orderTiming.timeOfPlacing=this.timeOfPlacing;
            orderTiming.timeOfPickUp=this.timeOfPickUp;
            orderTiming.description=this.description;
            return orderTiming;
        }
    }
}
