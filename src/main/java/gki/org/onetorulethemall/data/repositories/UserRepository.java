package gki.org.onetorulethemall.data.repositories;

import gki.org.onetorulethemall.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
