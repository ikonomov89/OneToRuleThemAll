package gki.org.onetorulethemall.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/register")
    public String getRegister() {
        return "auth/register.html";
    }

//    @GetMapping("/login")
//    public String getLogin() {
//        return "auth/login.html";
//    }

}
