package domain.item.impl.beverage.nonalcohol.impl;

public class EnergyDrink {
    private String id;
    private String name;

    private EnergyDrink() {
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
        public EnergyDrink build(){
            EnergyDrink energyDrink =new EnergyDrink();
            energyDrink.id=this.id;
            energyDrink.name=this.name;
            return energyDrink;
        }
    }
}
