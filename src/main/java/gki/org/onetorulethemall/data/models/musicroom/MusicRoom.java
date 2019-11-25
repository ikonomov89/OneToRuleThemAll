package gki.org.onetorulethemall.data.models.musicroom;

import gki.org.onetorulethemall.data.models.BaseEntity;
import gki.org.onetorulethemall.data.models.User;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "music_rooms")
public class MusicRoom extends BaseEntity {


    @OneToMany(mappedBy = "musicRoom")
    private List<Musician> artists;

    @OneToOne(mappedBy = "musicRoom")
    private User user;

}
