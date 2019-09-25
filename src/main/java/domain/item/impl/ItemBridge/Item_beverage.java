package domain.item.impl.ItemBridge;

public class Item_beverage {
    private String id;
    private String item_Branch;
    private String classic_id;
    private String description;

    private Item_beverage(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem_Branch() {
        return item_Branch;
    }

    public void setItem_Branch(String item_Branch) {
        this.item_Branch = item_Branch;
    }

    public String getBeverage_id() {
        return classic_id;
    }

    public void setBeverage_id(String classic_id) {
        this.classic_id = classic_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item_beverage{" +
                "id='" + id + '\'' +
                ", item_Branch='" + item_Branch + '\'' +
                ", classic_id='" + classic_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String item_Branch;
        private String classic_id;
        private String description;

        public Builder(String id){
            this.id= id;
        }
        public Builder buildItem_Branch(String item_Branch){
            this.item_Branch=item_Branch;
            return this;
        }
        public Builder buildBeverage(String beverage_id){
            this.classic_id=classic_id;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Item_beverage build(){
            Item_beverage c=new Item_beverage();
            c.classic_id=this.classic_id;
            c.description=this.description;
            c.id=this.id;
            c.item_Branch=this.item_Branch;
            return c;
        }
    }
}
