package domain.item.impl.beverage.alcohol.alcoholBridge;

import domain.item.impl.beverage.beverage_Bridge.Beverage_Alcohol;

public class AlcoholItem {
    private String id;
    private String item_id;
    private String Beverage_id;
    private String description;

    private AlcoholItem() {
    }

    public String getBeverage_id() {
        return Beverage_id;
    }

    public void setBeverage_id(String Beverage_id) {
        this.Beverage_id = Beverage_id;
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
                ", beverage_id='" + Beverage_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String item_id;
        private String Beverage_id;
        private String description;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildBeverage_id(String Beverage_id){
            this.Beverage_id=Beverage_id;
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
        public AlcoholItem build(){
            AlcoholItem b=new AlcoholItem();
            b.description= this.description;
            b.id=this.id;
            b.Beverage_id=this.Beverage_id;
            b.item_id=this.item_id;
            return b;
        }
    }
}
