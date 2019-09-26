package controller.user;

import controller.ControllerInt;
import domain.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.user.impl.UserService;

import java.util.ArrayList;
@RestController
@RequestMapping("/user")
public class UserController implements ControllerInt<User,String> {

    @Autowired
    UserService userService;
    @PostMapping("/create")
    @Override
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    @GetMapping("/read")
    @Override
    public User read(@RequestParam(value = "id") String id) {
        return userService.read(id);
    }
    @GetMapping("/delete")
    @Override
    public void delete(@RequestParam(value = "id") String id) {
        userService.delete(id);
    }
    @PostMapping("/update")
    @Override
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<User> readAll() {
        return null;
    }
}
