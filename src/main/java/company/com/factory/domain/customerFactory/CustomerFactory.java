package company.com.factory.domain.customerFactory;

import company.com.domain.customerBuilder.Customer;

public class CustomerFactory {
    public static Customer getCustomer(  String email,String customer_number,String description,String Name, String SurName,String userType) {
        return new Customer.Builder(email)
                .buildName(Name)
                .buildSurName(SurName)
                .buildUserType(userType)
                .buildDescription(description)
                .build();
    }
}
