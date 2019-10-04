package company.com.controller.login;

import company.com.controller.ControllerInt;
import company.com.domain.users.Login;
import company.com.service.user.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/LDS/login")
public class LoginController implements ControllerInt<Login,String> {
    @Autowired
    LoginService loginService;
    @PostMapping("login")
    public Login myLogin(@RequestBody Login login){
        System.out.println(login.toString()+"in mylogin");
        return loginService.myLogin(login.getEmail(),login.getPassword());
    }
    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Login create(@RequestBody Login login){
        System.out.println(login.toString());
        Login result=loginService.create(login);
        System.out.println(result.toString());
        return result;
    }
    @GetMapping("/read")
    @Override
    public Login read(@RequestParam(value = "id") String id) {
        return loginService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        loginService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public Login update(@RequestBody Login login) {
        return loginService.update(login);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<Login> readAll() {
        return loginService.readAlll();
    }
}
