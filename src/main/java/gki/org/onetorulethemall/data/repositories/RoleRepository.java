package gki.org.onetorulethemall.data.repositories;

import gki.org.onetorulethemall.data.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    Role findByAuthority(String authority);

}
