package company.com.domain.cashierBuilderPack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cashier {
    @Id
    private String email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String id) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "  \n     Cashier\n   ------" +
                "\n name:    " + name +
                "\n surName: " + surName +
                "\n id:      " + email;
    }

    public static class Builder {
        private String name;
        private String surName;
        private String email;

        public Builder(String email) {
            this.email = email;
        }

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildSurname(String surName) {
            this.surName = surName;
            return this;
        }

        public Cashier build() {
            Cashier cashierProduct = new Cashier();
            cashierProduct.email = this.email;
            cashierProduct.name = this.name;
            cashierProduct.surName = this.surName;
            return cashierProduct;
        }
    }
}
