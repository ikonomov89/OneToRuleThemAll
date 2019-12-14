package gki.org.onetorulethemall.data.repositories;

import gki.org.onetorulethemall.data.models.musicroom.Musician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, String> {

}
