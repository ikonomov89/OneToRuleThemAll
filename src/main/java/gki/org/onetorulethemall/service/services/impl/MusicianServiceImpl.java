package gki.org.onetorulethemall.service.services.impl;

import gki.org.onetorulethemall.data.models.User;
import gki.org.onetorulethemall.data.models.musicroom.Musician;
import gki.org.onetorulethemall.data.repositories.MusicianRepository;
import gki.org.onetorulethemall.service.models.MusicianServiceModel;
import gki.org.onetorulethemall.service.services.MusicianService;
import gki.org.onetorulethemall.service.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MusicianServiceImpl implements MusicianService {

    private final MusicianRepository musicianRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;

    @Autowired
    public MusicianServiceImpl(MusicianRepository musicianRepository, ModelMapper modelMapper, UserService userService) {
        this.musicianRepository = musicianRepository;
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @Override
    public MusicianServiceModel addMusician(MusicianServiceModel musicianServiceModel, String loggedUser) {
        Musician musician = this.modelMapper.map(musicianServiceModel, Musician.class);

        this.userService.addProperty(musician, loggedUser);
        musician.setUser(this.modelMapper.map(this.userService.findByUsername(loggedUser), User.class));

        return this.modelMapper
                .map(this.musicianRepository.saveAndFlush(musician), MusicianServiceModel.class);
    }

    @Override
    public List<MusicianServiceModel> findAllMusicians(String loggedUser) {
        User user = this.modelMapper.map(this.userService.findByUsername(loggedUser), User.class);

        List<Musician> musicians = user.getMusicians();

        return musicians.stream()
                .map(musician -> this.modelMapper.map(musician, MusicianServiceModel.class))
                .collect(Collectors.toList());

    }


    @Override
    public void deleteMusician(String id) {
        Musician musician = this.musicianRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not found"));

        this.musicianRepository.delete(musician);

    }
}
