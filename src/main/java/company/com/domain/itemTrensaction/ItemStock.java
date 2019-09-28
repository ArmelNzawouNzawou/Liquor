package company.com.domain.itemTrensaction;

public class ItemStock {
    private String stockId;
    private String itemId;
    private double itemPrice;
    private int quantity;
    private String descrption;

    private ItemStock() {
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemStock{" +
                "stockId='" + stockId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantity=" + quantity +
                ", descrption='" + descrption + '\'' +
                '}';
    }

    public static class Builder{
        private String stockId;
        private String itemId;
        private double itemPrice;
        private int quantity;
        private String descrption;


        public Builder(String stockId){
            this.stockId=stockId;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildItemPrice(double itemPrice){
            this.itemPrice=itemPrice;
            return this;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public Builder buildDescription(String descrption){
            this.descrption=descrption;
            return this;
        }
        public ItemStock build(){
            ItemStock it=new ItemStock();
            it.descrption=this.descrption;
            it.itemId=this.itemId;
            it.itemPrice=this.itemPrice;
            it.stockId=this.stockId;
            it.quantity=this.quantity;
            return it;
        }
    }
}
