package company.com.domain.cashierBuilderPack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cashier {
    @Id
    private String id;
    private String name;
    private String surName;


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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        private String id;
        public Builder(String id){
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
