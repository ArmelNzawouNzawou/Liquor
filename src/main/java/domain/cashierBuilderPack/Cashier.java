package domain.cashierBuilderPack;

public class Cashier {
    private String name;
    private String surName;
    private int id;

    private Cashier() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "  \n     Cashier\n   ------" +
                "\n name:    " + name +
                "\n surName: " + surName +
                "\n id:      " + id;
    }
    public static class Builder{
        private String name;
        private String surName;
        private int id;
        public Builder(int id){
            this.id=id;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildSurname(String surName){
            this.surName=surName;
            return this;
        }
        public Cashier build(){
            Cashier cashierProduct=new Cashier();
            cashierProduct.id=this.id;
            cashierProduct.name=this.name;
            cashierProduct.surName=this.surName;
            return cashierProduct;
        }
    }
}
