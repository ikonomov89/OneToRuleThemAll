package gki.org.onetorulethemall.data.models;

import gki.org.onetorulethemall.data.models.bankit.BankIt;
import gki.org.onetorulethemall.data.models.friendstar.Friendstar;
import gki.org.onetorulethemall.data.models.moviehub.MovieHub;
import gki.org.onetorulethemall.data.models.musicroom.MusicRoom;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity implements UserDetails {

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "gender")
    private String gender;

    @ManyToMany(targetEntity = Role.class, fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private List<Role> authorities;

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

    public User() {
    }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Friendstar getFriendstar() {
        return friendstar;
    }

    public void setFriendstar(Friendstar friendstar) {
        this.friendstar = friendstar;
    }

    public BankIt getBankIt() {
        return bankIt;
    }

    public void setBankIt(BankIt bankIt) {
        this.bankIt = bankIt;
    }

    public MusicRoom getMusicRoom() {
        return musicRoom;
    }

    public void setMusicRoom(MusicRoom musicRoom) {
        this.musicRoom = musicRoom;
    }

    public MovieHub getMovieHub() {
        return movieHub;
    }

    public void setMovieHub(MovieHub movieHub) {
        this.movieHub = movieHub;
    }

    @Override
    public List<Role> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Role> authorities) {
        this.authorities = authorities;
    }
}
