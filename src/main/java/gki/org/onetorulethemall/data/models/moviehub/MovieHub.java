package gki.org.onetorulethemall.data.models.moviehub;

import gki.org.onetorulethemall.data.models.BaseEntity;
import gki.org.onetorulethemall.data.models.User;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "movie_hubs")
public class MovieHub extends BaseEntity {

    @OneToMany(mappedBy = "movieHub")
    private List<Movie> movies;

    @OneToOne(mappedBy = "movieHub")
    private User user;
}
