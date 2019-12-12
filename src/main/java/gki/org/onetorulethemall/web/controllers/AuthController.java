package gki.org.onetorulethemall.web.controllers;

import gki.org.onetorulethemall.service.models.UserServiceModel;
import gki.org.onetorulethemall.service.services.UserService;
import gki.org.onetorulethemall.web.models.binding.UserBindingModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
public class AuthController extends BaseController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/register")
    @PreAuthorize("isAnonymous()")
    public ModelAndView register() {
        return super.view("auth/register.html");
    }

    @GetMapping("/login")
    @PreAuthorize("isAnonymous()")
    public ModelAndView login() {
        return super.view("auth/login.html");
    }


    @PostMapping("/register")
    @PreAuthorize("isAnonymous()")
    public ModelAndView registerPost(@ModelAttribute UserBindingModel model) {
        if (!model.getPassword().equals(model.getConfirmPassword())) {
            return super.view("auth/register.html");
        }
        this.userService.registerUser(this.modelMapper.map(model, UserServiceModel.class));
        return super.view("auth/login.html");
//      return super.redirect("/login");
    }

}
