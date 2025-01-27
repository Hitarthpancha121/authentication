package usernamePassAuth.authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import usernamePassAuth.authentication.Modal.User;
import usernamePassAuth.authentication.Service.AuthenticationService;

@RestController
@RequestMapping("/auth")
public class  AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public String authenticate(@RequestBody User usrr) {
        boolean isAuthenticated = authenticationService.authenticate(usrr);
        if (isAuthenticated) {
            return "Authentication successful!  ---> User Found In Database";
        } else {
            return "Invalid username or password!";
        }
    }

    @GetMapping("/get")
    public User getuser(@RequestBody User user){
        User finalUser= authenticationService.getUser(user);
        return finalUser;
    }

}
