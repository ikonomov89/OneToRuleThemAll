package gki.org.onetorulethemall.service.services;

import gki.org.onetorulethemall.service.models.UserServiceModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserServiceModel registerUser(UserServiceModel user);

    void addProperty(Object o, String username);

    UserServiceModel findByUsername(String username);
}
