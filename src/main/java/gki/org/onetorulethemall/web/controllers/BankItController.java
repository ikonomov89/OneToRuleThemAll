package gki.org.onetorulethemall.web.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankit")
public class BankItController extends BaseController {

    @GetMapping("/bankit-home")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView homeBankIt() {
        return super.view("bankit/bankit-home");
    }

    @GetMapping("/cards-details")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView detailsCards() {
        return super.view("bankit/cards-details");
    }

    @GetMapping("/bills-details")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView detailsBills() {
        return super.view("bankit/bills-details");
    }


    @GetMapping("/add-card")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView addCard() {
        return super.view("bankit/add-card");
    }


    @GetMapping("/add-bill")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView addBill() {
        return super.view("bankit/add-bill");
    }


}
