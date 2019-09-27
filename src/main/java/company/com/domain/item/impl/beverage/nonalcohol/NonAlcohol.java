package company.com.domain.item.impl.beverage.nonalcohol;

public class NonAlcohol {
    private String nonAlcohol_id;
    private String ContainerType;
    private String naturelPercentage;
    private String item_id;

    private NonAlcohol() {
    }

    public String getAlcohol_id() {
        return nonAlcohol_id;
    }

    public void setAlcohol_id(String nonAlcohol_id) {
        nonAlcohol_id = nonAlcohol_id;
    }

    public String getContainerType() {
        return ContainerType;
    }

    public void setContainerType(String containerType) {
        ContainerType = containerType;
    }

    public String getNaturelPercentage() {
        return naturelPercentage;
    }

    public void setNaturelPercentage(String naturelPercentage) {
        this.naturelPercentage = naturelPercentage;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
    public static class Builder{
        private String nonAlcohol_id;
        private String ContainerType;
        private String naturelPercentage;
        private String item_id;
        public Builder(String nonAlcohol_id){
            this.nonAlcohol_id=nonAlcohol_id;
        }
        public Builder buildContaina(String containerType){
            this.ContainerType=containerType;
            return this;
        }
        public Builder buildNaturelPercentage(String naturelPercentage){
            this.naturelPercentage=naturelPercentage;
            return this;
        }
        public Builder buildItemId(String item_id){
            this.item_id=item_id;
            return this;
        }
        public NonAlcohol build(){
            NonAlcohol nonAlcohol=new NonAlcohol();
            nonAlcohol.nonAlcohol_id=this.nonAlcohol_id;
            nonAlcohol.naturelPercentage=this.naturelPercentage;
            nonAlcohol.ContainerType=this.ContainerType;
            nonAlcohol.item_id=this.item_id;
            return nonAlcohol;
        }
    }
}
