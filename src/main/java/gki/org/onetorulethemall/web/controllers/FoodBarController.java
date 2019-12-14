package gki.org.onetorulethemall.web.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/foodbar")
public class FoodBarController extends BaseController {


    @GetMapping("/foodbar-home")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView homeFoodBar() {
        return super.view("foodbar/foodbar-home");
    }


    @GetMapping("/foodbar-details")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView detailsFoodBar() {
        return super.view("foodbar/foodbar-details");
    }


    @GetMapping("/add-drink")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView addDrink() {
        return super.view("foodbar/add-drink");
    }


    @GetMapping("/add-food")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView addFood() {
        return super.view("foodbar/add-food");
    }


}
