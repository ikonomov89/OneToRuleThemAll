package gki.org.onetorulethemall.data.models.musicroom;

import gki.org.onetorulethemall.data.models.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "musicians")
public class Musician extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "favorite_songs")
    private String favoriteSongs;

    @ManyToOne
    @JoinColumn(name = "music_room_id", referencedColumnName = "id")
    private MusicRoom musicRoom;

}
