package company.com.domain.customerBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String email;
    private String name;
    private String SurName;


    private Customer() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String customer_number) {
        this.email = customer_number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }


    @Override
    public String toString() {
        return "CustomerProduct" +
                "\ncustomer numb:" + email +
                "\nname:         " + name +
                "\nSurName:      " + SurName;

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

        public Customer build() {
            Customer customerProduct = new Customer();
            customerProduct.email = email;
            customerProduct.name = name;
            customerProduct.SurName = surName;
            return customerProduct;
        }
    }
}
