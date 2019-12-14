package gki.org.onetorulethemall.service.services;

import gki.org.onetorulethemall.service.models.MusicianServiceModel;

import java.util.List;

public interface MusicianService {

    MusicianServiceModel addMusician(MusicianServiceModel musicianServiceModel, String loggedUser);

    List<MusicianServiceModel> findAllMusicians(String loggedUser);

    void deleteMusician(String id);
}
