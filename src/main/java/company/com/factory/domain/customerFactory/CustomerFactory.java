package company.com.factory.domain.customerFactory;

import company.com.domain.customerBuilder.Customer;
import company.com.util.IdGenerator;

public class CustomerFactory {
    public static Customer getCustomer(  String email,String description,String Name,String SurName,String userType) {
        return new Customer.Builder(email)
                .buildName(Name)
                .buildSurName(SurName)
                .buildUserType(userType)
                .buildDescription(description)
                .build();
    }
}
