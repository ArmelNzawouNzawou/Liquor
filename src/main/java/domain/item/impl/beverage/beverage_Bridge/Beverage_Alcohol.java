package domain.item.impl.beverage.beverage_Bridge;

public class Beverage_Alcohol {
    private String id;
    private String item_id;
    private String beverage_id;
    private String description;

    private Beverage_Alcohol() {
    }

    public String getBeverage_id() {
        return beverage_id;
    }

    public void setBeverage_id(String beverage_id) {
        this.beverage_id = beverage_id;
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
                ", beverage_id='" + beverage_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String item_id;
        private String beverage_id;
        private String description;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildBeverageId(String beverage_id){
            this.beverage_id=beverage_id;
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
        public Beverage_Alcohol build(){
            Beverage_Alcohol b=new Beverage_Alcohol();
            b.description= this.description;
            b.id=this.id;
            b.beverage_id=this.beverage_id;
            b.item_id=this.item_id;
            return b;
        }
    }
}
