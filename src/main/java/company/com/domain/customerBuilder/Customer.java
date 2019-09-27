package company.com.domain.customerBuilder;

    public class Customer {
    private String name;
    private String SurName;
    private String customer_number;

    private Customer() {

    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
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
                "\ncustomer numb:" + customer_number +
                "\nname:         " + name +
                "\nSurName:      " + SurName ;

    }

    public static class Builder {
        private String name;
        private String surName;
        private String customer_number;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildSurname(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder (String customer_number) {
            this.customer_number = customer_number;

        }

        public Customer build() {
            Customer customerProduct = new Customer();
            customerProduct.customer_number = customer_number;
            customerProduct.name = name;
            customerProduct.SurName = surName;
            return customerProduct;
        }
    }
}
