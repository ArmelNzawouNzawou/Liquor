package domain.customerBuilder;

    public class Customer {

    private String name;
    private String SurName;
    private String emailAddress;
    private String address;
    private String phone_number;
    private String customer_number;

    private Customer() {

    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerProduct" +
                "\ncustomer numb:" + customer_number +
                "\nname:         " + name +
                "\nSurName:      " + SurName +
                "\nemailAddress: " + emailAddress +
                "\naddress:      " + address +
                "\nphone number: " + phone_number;

    }

    public static class Builder {
        private String name;
        private String surName;
        private String emailAddress;
        private String address;
        private String phone_number;
        private String customer_number;

        public Builder(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildSurname(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder buildAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder buildPhoneNumber(String phone_number) {
            this.phone_number = phone_number;
            return this;
        }

        public Builder id(String customer_number) {
            this.customer_number = customer_number;
            return this;
        }

        public Customer build() {
            Customer customerProduct = new Customer();
            customerProduct.phone_number = phone_number;
            customerProduct.address = address;
            customerProduct.customer_number = customer_number;
            customerProduct.emailAddress = emailAddress;
            customerProduct.name = name;
            customerProduct.SurName = surName;
            return customerProduct;
        }
    }
}
