package gki.org.onetorulethemall.data.models.foodbar;


import gki.org.onetorulethemall.data.models.BaseEntity;
import gki.org.onetorulethemall.data.models.User;

import javax.persistence.*;

@Entity
@Table(name = "foods")
public class Food extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "quantities")
    private Integer quantity;

    @Column(name = "kilos")
    private Double kilos;

    @Column(name = "additional_requirements")
    private String additionalRequirements;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getKilos() {
        return kilos;
    }

    public void setKilos(Double kilos) {
        this.kilos = kilos;
    }

    public String getAdditionalRequirements() {
        return additionalRequirements;
    }

    public void setAdditionalRequirements(String additionalRequirements) {
        this.additionalRequirements = additionalRequirements;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
