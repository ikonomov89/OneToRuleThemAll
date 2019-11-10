package gki.org.onetorulethemall.data.models;

import gki.org.onetorulethemall.data.models.bankit.BankIt;
import gki.org.onetorulethemall.data.models.friendstar.Friendstar;
import gki.org.onetorulethemall.data.models.moviehub.MovieHub;
import gki.org.onetorulethemall.data.models.musicroom.MusicRoom;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "friends_star_id", referencedColumnName = "id")
    private Friendstar friendstar;

    @OneToOne
    @JoinColumn(name = "bank_it_id", referencedColumnName = "id")
    private BankIt bankIt;

    @OneToOne
    @JoinColumn(name = "music_room_id", referencedColumnName = "id")
    private MusicRoom musicRoom;

    @OneToOne
    @JoinColumn(name = "movie_hub_id", referencedColumnName = "id")
    private MovieHub movieHub;


}
