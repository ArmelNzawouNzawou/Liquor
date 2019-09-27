package company.com.domain.item.impl.beverage.nonalcohol.impl;

public class Juice {
    private String id;
    private String name;

    private Juice() {
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
        return "CoolDrink{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String name;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Juice build(){
            Juice juice =new Juice();
            juice.id=this.id;
            juice.name=this.name;
            return juice;
        }
    }
}
