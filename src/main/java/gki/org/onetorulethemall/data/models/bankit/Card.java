package gki.org.onetorulethemall.data.models.bankit;

import gki.org.onetorulethemall.data.models.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public class Card extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "amount")
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "bank_it_id", referencedColumnName = "id")
    private BankIt bankIt;

}
