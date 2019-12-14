package gki.org.onetorulethemall.web.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/moviehub")
public class MovieHubController extends BaseController {

    @GetMapping("/moviehub-home")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView homeMovieHub() {
        return super.view("moviehub/moviehub-home");
    }


    @GetMapping("/moviehub-details")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView detailsMovieHub() {
        return super.view("moviehub/moviehub-details");
    }


    @GetMapping("/top-movie")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView topMovie() {
        return super.view("moviehub/top-movie");
    }


    @GetMapping("/add-movie")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView addMovie() {
        return super.view("moviehub/add-movie");
    }


}
