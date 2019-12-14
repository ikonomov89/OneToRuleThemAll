package gki.org.onetorulethemall.web.controllers;

import gki.org.onetorulethemall.service.models.MusicianServiceModel;
import gki.org.onetorulethemall.service.services.MusicianService;
import gki.org.onetorulethemall.web.models.binding.MusicianBindingModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/musicroom")
public class MusicRoomController extends BaseController {

    private final MusicianService musicianService;
    private final ModelMapper modelMapper;

    @Autowired
    public MusicRoomController(MusicianService musicianService, ModelMapper modelMapper) {
        this.musicianService = musicianService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/musicroom-home")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView homeMusicRoom() {
        return super.view("musicroom/musicroom-home");
    }

    @GetMapping("/top-music")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView topMusic() {
        return super.view("musicroom/top-music");
    }

    @GetMapping("/musicroom-details")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView detailsMusicRoom(ModelAndView modelAndView, Principal principal) {

        List<MusicianServiceModel> musicians = this.musicianService.findAllMusicians(principal.getName());
        modelAndView.addObject("musicians", musicians);

        return super.view("musicroom/musicroom-details", modelAndView);

    }

    @GetMapping("/add-music")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView addMusic() {
        return super.view("musicroom/add-music");
    }

    @PostMapping({"/add-music", "/top-music"})
    @PreAuthorize("isAuthenticated()")
    public ModelAndView addMusicPost(@ModelAttribute MusicianBindingModel musicianBindingModel, Principal principal) {

        String loggedUser = principal.getName();

        MusicianServiceModel musicianServiceModel = this.modelMapper.map(musicianBindingModel, MusicianServiceModel.class);
        this.musicianService.addMusician(musicianServiceModel, loggedUser);

        return super.redirect("/musicroom/musicroom-details");
    }

//    @PostMapping("/top-music")
//    @PreAuthorize("isAuthenticated()")
//    public ModelAndView addMusicFromTop(@ModelAttribute MusicianBindingModel musicianBindingModel, Principal principal) {
//
//        String loggedUser = principal.getName();
//
//        MusicianServiceModel musicianServiceModel = this.modelMapper.map(musicianBindingModel, MusicianServiceModel.class);
//        this.musicianService.addMusician(musicianServiceModel, loggedUser);
//
//        return super.redirect("/musicroom/musicroom-details");
//    }

    @PostMapping("/delete/{id}")
    @PreAuthorize("isAuthenticated()")
    public ModelAndView deleteMusician(@PathVariable String id) {

        this.musicianService.deleteMusician(id);

        return super.redirect("/musicroom/musicroom-details");
    }


}
