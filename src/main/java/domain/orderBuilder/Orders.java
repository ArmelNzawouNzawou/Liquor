package domain.orderBuilder;


/***this is the product class*/
public class Orders {
    private String orderNumeber;
    private boolean orderCompleted;
    private String comment;



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

    public boolean isOrderCompleted() {
        return orderCompleted;
    }

    public void setOrderCompleted(boolean orderCompleted) {
        this.orderCompleted = orderCompleted;
    }


    @Override
    public String toString() {
        return  "   Orders\n   -------" +
                "\n orderNumeber:        " + orderNumeber +
                "\n orderCompleted:     " + orderCompleted ;

    }
    public static class Builder {
        private String orderNumeber;
        private boolean orderCompleted;
        private String comment;

        public Builder(String orderNumeber) {
            this.orderNumeber = orderNumeber;
        }

        public Builder buildOrderCompleted(boolean orderCompleted){
            this.orderCompleted=orderCompleted;
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
            orders.orderCompleted=this.orderCompleted;
            return orders;
        }
    }
}



