package gki.org.onetorulethemall.service.services;

import gki.org.onetorulethemall.service.models.RoleServiceModel;
import gki.org.onetorulethemall.service.models.UserServiceModel;

import java.util.List;

public interface RoleService {

    void seedRolesInDB();

//    void assingUserRoles(UserServiceModel userServiceModel, long numberOfUsers);

    List<RoleServiceModel> findAllRoles();

    RoleServiceModel findByAuthority(String authority);
}
