package domain.item.impl.beverage.nonalcohol.nonalcoholBridge;

public class NonAlcoholItem {
    private String id;
    private String item_id;
    private String nonAlcohol_id;
    private String description;

    private NonAlcoholItem() {
    }

    public String getAlcohol_id() {
        return nonAlcohol_id;
    }

    public void setBeverage_id(String alcohol_id) {
        this.nonAlcohol_id = alcohol_id;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Beverage_Alcohol{" +
                "id='" + id + '\'' +
                ", item_id='" + item_id + '\'' +
                ", beverage_id='" + nonAlcohol_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String item_id;
        private String nonAlcohol_id;
        private String description;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildAlcoholId(String nonAlcohol_id){
            this.nonAlcohol_id=nonAlcohol_id;
            return this;
        }
        public Builder buildItem_id(String item_id){
            this.item_id=item_id;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public NonAlcoholItem build(){
            NonAlcoholItem b=new NonAlcoholItem();
            b.description= this.description;
            b.id=this.id;
            b.nonAlcohol_id=this.nonAlcohol_id;
            b.item_id=this.item_id;
            return b;
        }
    }
}
