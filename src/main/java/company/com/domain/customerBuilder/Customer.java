package company.com.domain.customerBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
    public class Customer {
    @Id
    private String customer_number;
    private String description;

    private Customer() {

    }


    public String getCustomer_number() {
        return customer_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }



    @Override
    public String toString() {
        return "CustomerProduct" +
                "\ncustomer numb:" + customer_number +
                "\nname:         " + description ;

    }

    public static class Builder {
        private String description;
        private String customer_number;



        public Builder buildDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder (String customer_number) {
            this.customer_number = customer_number;

        }

        public Customer build() {
            Customer customerProduct = new Customer();
            customerProduct.customer_number = this.customer_number;
            customerProduct.description = this.description;
            return customerProduct;
        }
    }
}
