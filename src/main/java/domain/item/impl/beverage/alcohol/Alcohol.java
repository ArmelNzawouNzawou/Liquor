package domain.item.impl.beverage.alcohol;

public class Alcohol {
    private String Alcohol_id;
    private String ContainerType;
    private String alcoholePercentage;
    private String item_id;

    private Alcohol() {
    }

    public String getAlcohol_id() {
        return Alcohol_id;
    }

    public void setAlcohol_id(String alcohol_id) {
        Alcohol_id = alcohol_id;
    }

    public String getContainerType() {
        return ContainerType;
    }

    public void setContainerType(String containerType) {
        ContainerType = containerType;
    }

    public String getAlcoholePercentage() {
        return alcoholePercentage;
    }

    public void setAlcoholePercentage(String alcoholePercentage) {
        this.alcoholePercentage = alcoholePercentage;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
    public static class Builder{
        private String Alcohol_id;
        private String ContainerType;
        private String alcoholePercentage;
        private String item_id;
        public Builder(String alcohol_id){
            this.Alcohol_id=alcohol_id;
        }
        public Builder buildContaina(String containerType){
            this.ContainerType=containerType;
            return this;
        }
        public Builder buildAlcoholPercentage(String alcoholePercentage){
            this.alcoholePercentage=alcoholePercentage;
            return this;
        }
        public Builder buildItemId(String item_id){
            this.item_id=item_id;
            return this;
        }
        public Alcohol build(){
            Alcohol nonAlcohol=new Alcohol();
            nonAlcohol.Alcohol_id=this.Alcohol_id;
            nonAlcohol.alcoholePercentage=this.alcoholePercentage;
            nonAlcohol.ContainerType=this.ContainerType;
            nonAlcohol.item_id=this.item_id;
            return nonAlcohol;
        }
    }
}
