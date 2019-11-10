package gki.org.onetorulethemall.data.models.bankit;

import gki.org.onetorulethemall.data.models.BaseEntity;
import gki.org.onetorulethemall.data.models.User;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "bank_it")
public class BankIt extends BaseEntity {

    @OneToMany(mappedBy = "bankIt")
    private List<Card> cards;

    @OneToOne(mappedBy = "bankIt")
    private User user;

}
