package company.com.domain.item;

public class Item {
    private String id;
    private String itemName;
    private String itemBranch;

    private Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemNamer() {
        return itemName;
    }

    public void setItemNumber(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBranch() {
        return itemBranch;
    }

    public void setItemBranch(String itemBranch) {
        this.itemBranch = itemBranch;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", itemNumber='" + itemName + '\'' +
                ", itemBranch='" + itemBranch + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String itemName;
        private String itemBranch;
        public Builder(String itemName){
            this.itemName=itemName;
        }
        public Builder buildItemBranch(String itemBranch){
            this.itemBranch=itemBranch;
            return this;
        }
        public Builder buildId(String id){
            this.id=id;
            return this;
        }

        public Item build(){
            Item item=new Item();
            item.id=this.id;
            item.itemBranch=this.itemBranch;
            item.itemName=this.itemName;
            return item;
        }
    }
}
