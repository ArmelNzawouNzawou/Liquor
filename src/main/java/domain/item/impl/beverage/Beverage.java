package domain.item.impl.beverage;

public class Beverage {
    private String bev_id;
    private String category;
    private String item_id;

    private Beverage() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBev_id() {
        return bev_id;
    }

    public void setBev_id(String bev_id) {
        this.bev_id = bev_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "bev_id='" + bev_id + '\'' +
                ", category='" + category + '\'' +
                ", item_id='" + item_id + '\'' +
                '}';
    }

    public static class Builder{
        private String bev_id;
        private String item_id;
        private String category;

        public Builder(String bev_id){
            this.bev_id=bev_id;

        }
        public Builder builCategory(String category){
            this.category=category;
            return this;
        }

        public Builder buildItem_id(String item_id){
            this.item_id=item_id;
            return this;
        }
        public Beverage build(){
            Beverage beverage=new Beverage();
            beverage.bev_id=this.bev_id;
            beverage.item_id=this.item_id;
            beverage.category=this.category;
            return beverage;
        }
    }

}
