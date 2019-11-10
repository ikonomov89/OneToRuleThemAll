package gki.org.onetorulethemall.data.models.friendstar;

import gki.org.onetorulethemall.data.models.BaseEntity;
import gki.org.onetorulethemall.data.models.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "friend_stars")
public class Friendstar extends BaseEntity {


    @Column(name = "friends")
    @OneToMany(mappedBy = "friendstar")
    private List<User> friends;

}
