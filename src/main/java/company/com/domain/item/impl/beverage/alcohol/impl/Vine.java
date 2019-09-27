package company.com.domain.item.impl.beverage.alcohol.impl;

public class Vine {
    private String id;
    private String name;

    private Vine() {
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
        return "Vine{" +
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
        public Vine build(){
            Vine vine =new Vine();
            vine.id=this.id;
            vine.name=this.name;
            return vine;
        }
    }
}
