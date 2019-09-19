package domain.item.impl.classic.impl;



public class Chips {
    private String id;
    private String name;

    private Chips() {
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
        public Chips build(){
            Chips chips =new Chips();
            chips.id=this.id;
            chips.name=this.name;
            return chips;
        }
    }
}
