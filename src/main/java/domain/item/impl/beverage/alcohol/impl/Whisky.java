package domain.item.impl.beverage.alcohol.impl;

public class Whisky {
    private String id;
    private String name;

    private Whisky() {
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
        return "Whisky{" +
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
        public Whisky build(){
            Whisky whisky =new Whisky();
            whisky.id=this.id;
            whisky.name=this.name;
            return whisky;
        }
    }
}
