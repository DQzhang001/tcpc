package atf.tcpc.controller;

import atf.tcpc.base.domain.User;
import atf.tcpc.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserDetails(@PathVariable("id") String id){
        return userService.selectUser(id);
    }
}
