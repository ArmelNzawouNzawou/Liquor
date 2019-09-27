package company.com.controller.login;

import company.com.domain.users.Login;
import company.com.service.user.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/LDS")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("")
    public Login myLogin(@RequestBody Login login){
        System.out.println(login.toString()+"in mylogin");
        return loginService.myLogin(login.getEmail(),login.getPassword());
    }
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Login create(@RequestBody Login login){
        System.out.println(login.toString());
        Login result=loginService.create(login);
        System.out.println(result.toString());
        return result;
    }
}
