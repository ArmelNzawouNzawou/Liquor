package company.com.domain.item.impl.classic.impl;

public class Cigarate {
    private String id;
    private String name;

    private Cigarate() {
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
        public Cigarate build(){
            Cigarate cigarate =new Cigarate();
            cigarate.id=this.id;
            cigarate.name=this.name;
            return cigarate;
        }
    }
}
