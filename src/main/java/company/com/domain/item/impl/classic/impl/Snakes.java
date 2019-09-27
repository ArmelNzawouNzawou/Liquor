package company.com.domain.item.impl.classic.impl;

public class Snakes {
    private String id;
    private String name;

    private Snakes() {
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
        public Snakes build(){
            Snakes snakes =new Snakes();
            snakes.id=this.id;
            snakes.name=this.name;
            return snakes;
        }
    }
}
