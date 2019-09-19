package domain.orderLine;

public class OrderLine {
    private String lineId;
    private String OrderId;
    private String itemID;

    private OrderLine() {
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "lineId='" + lineId + '\'' +
                ", OrderId='" + OrderId + '\'' +
                ", itemID='" + itemID + '\'' +
                '}';
    }
    public static class Builder{
        private String lineId;
        private String OrderId;
        private String itemID;

        public Builder(String lineId){
            this.lineId=lineId;
        }
        public Builder buildOrderId(String orderId){
            this.OrderId=orderId;
            return this;
        }
        public Builder buildItemID(String itemID){
            this.itemID=itemID;
            return this;
        }
        public OrderLine build(){
            OrderLine orderLine=new OrderLine();
            orderLine.itemID=this.itemID;
            orderLine.lineId=this.lineId;
            orderLine.OrderId=this.OrderId;
            return orderLine;
        }
    }

}
