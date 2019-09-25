package domain.item.impl.beverage.alcohol;

public class Alcohol {
    private String Alcohol_id;
    private String item_id;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Alcohol() {
    }

    public String getAlcohol_id() {
        return Alcohol_id;
    }

    public void setAlcohol_id(String alcohol_id) {
        Alcohol_id = alcohol_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "Alcohol_id='" + Alcohol_id + '\'' +
                ", item_id='" + item_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String Alcohol_id;
        private String item_id;
        private String description;
        public Builder(String alcohol_id){
            this.Alcohol_id=alcohol_id;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Builder buildItemId(String item_id){
            this.item_id=item_id;
            return this;
        }
        public Alcohol build(){
            Alcohol nonAlcohol=new Alcohol();
            nonAlcohol.Alcohol_id=this.Alcohol_id;
            nonAlcohol.description=this.description;
            nonAlcohol.item_id=this.item_id;
            return nonAlcohol;
        }
    }
}
