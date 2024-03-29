package company.com.domain.item.impl.beverage.alcohol.impl;

public class Beer {
    private String id;
    private String name;
    private double price;
    private String size;
    private int quantity;

    private Beer() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String name;
        private double price;
        private String size;
        private int quantity;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildPrice(double price){
            this.price=price;
            return this;
        }
        public Builder buildSize(String size){
            this.size=size;
            return this;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Beer build(){
            Beer beer =new Beer();
            beer.id=this.id;
            beer.name=this.name;
            beer.price=this.price;
            beer.size=this.size;
            beer.quantity=this.quantity;
            return beer;
        }
    }
}
