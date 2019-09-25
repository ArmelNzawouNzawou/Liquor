package domain.item.impl.classic.classicBridge;

public class ClassicItem {
    private String id;
    private String item_id;
    private String classic_id;
    private String description;

    private ClassicItem() {
    }

    public String getClassic_id() {
        return classic_id;
    }

    public void setBeverage_id(String classic_id) {
        this.classic_id = classic_id;
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
                ", beverage_id='" + classic_id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String item_id;
        private String classic_id;
        private String description;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildClassicId(String classic_id){
            this.classic_id=classic_id;
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
        public ClassicItem build(){
            ClassicItem b =new ClassicItem();
            b.description =this.description;
            b.id=this.id;
            b.classic_id=this.classic_id;
            b.item_id=this.item_id;
            return b;
        }
    }
}
