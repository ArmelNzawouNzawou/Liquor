package domain.item.impl.beverage.alcohol.impl;

public class Beer {
    private String id;
    private String name;

    private Beer() {
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
        public Beer build(){
            Beer beer =new Beer();
            beer.id=this.id;
            beer.name=this.name;
            return beer;
        }
    }
}
