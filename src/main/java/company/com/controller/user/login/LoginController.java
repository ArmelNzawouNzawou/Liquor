package company.com.controller.user.login;

import company.com.controller.ControllerInt;
import company.com.domain.users.Login;
import company.com.service.user.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/LDS/login")
public class LoginController implements ControllerInt<Login,String> {

    @Autowired
    private LoginService loginService;

    @PostMapping("/create")
    @Override
    public Login create(@RequestBody Login login) {
        return loginService.create(login);
    }

    @GetMapping("/read")
    @Override
    public Login read(@RequestParam("id") String id) {
        return loginService.read(id);
    }

    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam("id") String id) {
        loginService.delete(id);
    }

    @PostMapping("/update")
    @Override
    public Login update(@RequestBody Login login) {
        return loginService.update(login);
    }

    @GetMapping("/reads")
    @Override
    public List<Login> readAll() {
        return loginService.readAlll();
    }
}
