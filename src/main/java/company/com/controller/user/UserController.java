package company.com.controller.user;

import company.com.controller.ControllerInt;
import company.com.domain.cashierBuilderPack.Cashier;
import company.com.domain.customerBuilder.Customer;
import company.com.domain.driver.Driver;
import company.com.domain.genericClasses.G_User;
import company.com.domain.users.Login;
import company.com.domain.users.User;
import company.com.factory.domain.cashierFactory.CashierFactory;
import company.com.factory.domain.customerFactory.CustomerFactory;
import company.com.factory.domain.driverFactory.DriverFactory;
import company.com.factory.domain.generic.G_userFactory;
import company.com.factory.domain.user.LoginFactory;
import company.com.factory.domain.user.UserFactory;
import company.com.service.Cashier.impl.CashierServicer;
import company.com.service.Driver.Impl.DriverService;
import company.com.service.customerServ.impl.CustomerService;
import company.com.service.user.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import company.com.service.user.impl.UserService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController /**implements ControllerInt<User,String>*/
{

    @Autowired
    UserService userService;
    @Autowired
    DriverService driverService;
    @Autowired
    CashierServicer cashierServicer;
    @Autowired
    CustomerService customerService;
    @Autowired
    LoginService loginService;

    Customer customer;
    Driver driver;
    Cashier cashier;
    private String user_description;
    private String success;
    private G_User g_user;

    @PostMapping("/create")
    public G_User create(@RequestBody G_User gu) {
        if (gu.getUserType().equalsIgnoreCase("customer")) {
            customer = CustomerFactory.getCustomer(gu.getEmail(), gu.getName(), gu.getSurName());
            Customer cust = customerService.create(customer);
            success = cust.getEmail();
            loginService.create(createLogin(gu.getEmail(),gu.getPassword(),"customer"));
            user_description = cust.toString();
        } else if (gu.getUserType().equalsIgnoreCase("cashier")) {
            cashier = CashierFactory.getCashier( gu.getName(), gu.getSurName());
            Cashier cash = cashierServicer.create(cashier);
            success = cash.getId();
            loginService.create(createLogin(gu.getEmail(),gu.getPassword(),"cashier"));
            user_description = cash.toString();
        } else if (gu.getUserType().equalsIgnoreCase("driver")) {
            driver = DriverFactory.getDriver(gu.getEmail(), gu.getStat(), gu.getName(), gu.getSurName());
            Driver dr = driverService.create(driver);
            user_description = dr.toString();
            success = dr.getEmail();
            loginService.create(createLogin(gu.getEmail(),gu.getPassword(),"driver"));

        }
        if (!success.equals(null) || !user_description.equals("")) {
            User user = UserFactory.getUser(gu.getName(), gu.getSurName(), gu.getUserType(), getDate());
            userService.create(user);
            return gu;
        }
        return null;
    }

    @GetMapping("/read")
    public G_User read(@RequestParam(value = "id") String id) {
        String user=null;
        String userType = null;
        User myUser = userService.read(id);
//(String stat,String email,String Name,String SurName,String UserType,String password)
        if (myUser != null) {
            userType = myUser.getUserType();
            switch (userType) {
                case "cashier":
                    cashier=cashierServicer.read(myUser.getEmail());
                  user=cashier.toString();
                  g_user= G_userFactory.getUser("",id,cashier.getName(),cashier.getSurName(),"cashier",myUser.getPassword());
                case "customer":
                    customer=customerService.read(myUser.getEmail());
                  user=customer.toString();
                    g_user= G_userFactory.getUser("",id,customer.getName(),customer.getSurName(),"cashier",myUser.getPassword());

                case "driver":
                    driver=driverService.read(myUser.getEmail());
                    user=driver.toString();
                    g_user= G_userFactory.getUser("",id,driver.getName(),driver.getSurName(),"cashier",myUser.getPassword());

                    break;
            }
        return g_user;
        }
        return null;
    }

    @GetMapping("/delete")
    public void delete(@RequestParam(value = "id") String id) {
        String user=null;
        String userType = null;
        User myUser = userService.read(id);
        if (myUser != null) {
            userType = myUser.getUserType();
            switch (userType) {
                case "cashier":
                    cashier = cashierServicer.read(myUser.getEmail());
                    user = cashier.toString();
                    g_user = G_userFactory.getUser("", id, cashier.getName(), cashier.getSurName(), "cashier", myUser.getPassword());
                    cashierServicer.delete(id);
                    loginService.delete(id);
                case "customer":
                    customer = customerService.read(myUser.getEmail());
                    user = customer.toString();
                    g_user = G_userFactory.getUser("", id, customer.getName(), customer.getSurName(), "cashier", myUser.getPassword());
                    customerService.delete(id);
                    loginService.delete(id);
                case "driver":
                    driver = driverService.read(myUser.getEmail());
                    user = driver.toString();
                    g_user = G_userFactory.getUser("", id, driver.getName(), driver.getSurName(), "cashier", myUser.getPassword());
                    driverService.delete(id);
                    loginService.delete(id);
                    break;
            }
        }
        userService.delete(id);
    }

    @PostMapping("/update")
    public G_User update(@RequestBody G_User user) {

        String stringUser=null;
        String userType = userService.read(user.getEmail()).getUserType();
        User newUser=UserFactory.getUser(user.getEmail(),user.getPassword(),user.getUserType(),getDate()+"  updated");
//(String stat,String email,String Name,String SurName,String UserType,String password)
            if (user != null) {
               // userType = myUser.getUserType();
                switch (userType) {
                    case "cashier":
                        cashier=CashierFactory.getCashier(user.getName(),user.getSurName());
                        //cashier=cashierServicer.read(user.getEmail());
                        cashierServicer.update(cashier);
                        stringUser=cashier.toString();
                        g_user= G_userFactory.getUser("",user.getEmail(),cashier.getName(),cashier.getSurName(),"cashier",newUser.getPassword());
                    case "customer":
                        customer=CustomerFactory.getCustomer(user.getEmail(),user.getName(),user.getSurName());
                        customer=customerService.read(user.getEmail());
                        customerService.update(customer);
                        stringUser=customer.toString();
                        g_user= G_userFactory.getUser("",user.getEmail(),customer.getName(),customer.getSurName(),"cashier",newUser.getPassword());

                    case "driver":
                        driver=driverService.read(user.getEmail());
                        driverService.update(driver);
                        stringUser=driver.toString();
                        g_user= G_userFactory.getUser(user.getStat(),user.getEmail(),driver.getName(),driver.getSurName(),"cashier",newUser.getPassword());
                        break;
                }
                userService.update(newUser);
                return g_user;
            }
        return null;
    }

    @GetMapping("/reads")
    public ArrayList<User> readAll() {
        return userService.readAlll();
    }

    public String getDate() {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return sdf.format(now);
    }
    public Login createLogin(String email,String password,String userId){
        Login login= LoginFactory.getLogin(email,password,userId);
        return login;
    }
}
