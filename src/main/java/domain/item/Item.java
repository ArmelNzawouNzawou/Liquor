package domain.item;

public class Item {
    private String itemNumber;
    private String itemBranch;
    private String itemPrice;

    private Item() {
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemBranch() {
        return itemBranch;
    }

    public void setItemBranch(String itemBranch) {
        this.itemBranch = itemBranch;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemNumber='" + itemNumber + '\'' +
                ", itemBranch='" + itemBranch + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                '}';
    }
    public static class Builder{
        private String itemNumber;
        private String itemBranch;
        private String itemPrice;
        public Builder(String itemNumber){
            this.itemNumber=itemNumber;
        }
        public Builder buildItemBranch(String itemBranch){
            this.itemBranch=itemBranch;
            return this;
        }
        public Builder buildItemPrice(String itemPrice){
            this.itemPrice=itemPrice;
            return this;
        }
        public Item build(){
            Item item=new Item();
            item.itemBranch=this.itemBranch;
            item.itemNumber=this.itemNumber;
            item.itemPrice=this.itemPrice;
            return item;
        }
    }
}
