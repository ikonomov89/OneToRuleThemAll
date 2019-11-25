package gki.org.onetorulethemall.service.services.impl;

import gki.org.onetorulethemall.data.models.User;
import gki.org.onetorulethemall.data.repositories.UserRepository;
import gki.org.onetorulethemall.service.models.UserServiceModel;
import gki.org.onetorulethemall.service.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void register(UserServiceModel user) {
        this.userRepository.save(this.modelMapper.map(user, User.class));
    }
}
