package company.com.domain.item.impl.classic;

public class Classic {
    private String clissic_id;
    private String color;
    private String item_id;

    private Classic() {
    }

    public String getClissic_id() {
        return clissic_id;
    }

    public void setClissic_id(String clissic_id) {
        this.clissic_id = clissic_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
    public static class Builder{
        private String clissic_id;
        private String color;
        private String item_id;

        public Builder(String clissic_id){
            this.clissic_id=clissic_id;
        }
        public Builder buildColor(String color){
            this.color=color;
            return this;
        }
        public Builder buildItemId(String item_id){
            this.item_id=item_id;
            return this;
        }
        public Classic build(){
            Classic classic=new Classic();
            classic.clissic_id=this.clissic_id;
            classic.color=this.color;
            classic.item_id=this.item_id;
            return classic;
        }
    }

}
