package domain.item.impl.beverage.nonalcohol.impl;

public class CoolDrink {
    private String id;
    private String name;

    private CoolDrink() {
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
        public CoolDrink build(){
            CoolDrink coolDrink =new CoolDrink();
            coolDrink.id=this.id;
            coolDrink.name=this.name;
            return coolDrink;
        }
    }
}
