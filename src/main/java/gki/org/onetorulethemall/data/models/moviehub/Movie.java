package gki.org.onetorulethemall.data.models.moviehub;

import gki.org.onetorulethemall.data.models.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "trailer")
    private String trailer;

    @ManyToOne
    @JoinColumn(name = "movie_hub_id", referencedColumnName = "id")
    private MovieHub movieHub;

}
