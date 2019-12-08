package gki.org.onetorulethemall.data.models.bankit;

import gki.org.onetorulethemall.data.models.BaseEntity;

import javax.persistence.*;

@Table
@Entity(name = "bills")
public class Bill extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "due")
    private Integer due;

    @Column(name = "payment_date")
    private String paymentDate;

    @ManyToOne
    @JoinColumn(name = "bank_it_id", referencedColumnName = "id")
    private BankIt bankIt;

}
