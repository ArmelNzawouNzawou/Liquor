package company.com.domain.item.impl.ItemBridge;

public class Item_Classic {
    private String id;
    private String item_id;
    private String classic_id;
    private String description;

    private Item_Classic(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getClassic_id() {
        return classic_id;
    }

    public void setClassic_id(String classic_id) {
        this.classic_id = classic_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static class Builder{
        private String id;
        private String item_id;
        private String classic_id;
        private String description;

        public Builder(String id){
            this.id= id;
        }
        public Builder buildItemId(String item_id){
            this.item_id=item_id;
            return this;
        }
        public Builder buildClassicId(String classic_id){
            this.classic_id=classic_id;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Item_Classic build(){
            Item_Classic c=new Item_Classic();
            c.classic_id=this.classic_id;
            c.description=this.description;
            c.id=this.id;
            c.item_id=this.item_id;
            return c;
        }
    }
}
