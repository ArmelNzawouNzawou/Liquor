package company.com.domain.customerBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
    public class Customer {
    @Id
    private String email;
    private String customer_number;
    private String description;
    private String Name;
    private String SurName;
    private String userType;

    private Customer() {

    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return Name;
    }

    public String getSurName() {
        return SurName;
    }



    public void setEmail(String email) {
        this.email = email;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setCustomer(String customer_number) {
        this.customer_number = customer_number;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", customer_number='" + customer_number + '\'' +
                ", description='" + description + '\'' +
                ", Name='" + Name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    public static class Builder {
        private String email;
        private String description;
        private String Name;
        private String SurName;
        private String userType;

        public Builder(String email){
            this.email=email;
        }

        public Builder buildUserType(String userType){
            this.userType=userType;
            return this;
        }

        public Builder buildDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder buildName (String Name) {
            this.Name = Name;

            return this;

        }
        public Builder buildSurName (String SurName) {
            this.SurName = SurName;

            return this;

        }

        public Customer build() {
            Customer customerProduct = new Customer();
            customerProduct.description = this.description;
            customerProduct.Name = this.Name;
            customerProduct.SurName = this.SurName;
            customerProduct.email=this.email;
            customerProduct.userType=this.userType;
            return customerProduct;
        }
    }
}
