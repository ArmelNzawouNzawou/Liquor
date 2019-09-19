package domain.orderTiming;

public class OrderTiming {
    private String OrderNumber;
    private String timeOfPlacing;
    private String timeOfPickUp;
    private String timeOfComplition;

    private OrderTiming() {
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
    public static class Builder{
        private String OrderNumber;
        private String timeOfPlacing;
        private String timeOfPickUp;
        private String timeOfComplition;
        public Builder(String orderNumber){
            this.OrderNumber=orderNumber;
        }
        public Builder buildTPlacing(String timeOfPlacing){
            this.timeOfPlacing=timeOfPlacing;
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
            return orderTiming;
        }
    }
}
