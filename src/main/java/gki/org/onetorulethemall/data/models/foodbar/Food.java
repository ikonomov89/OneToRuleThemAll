package gki.org.onetorulethemall.data.models.foodbar;


import gki.org.onetorulethemall.data.models.BaseEntity;

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
    @JoinColumn(name = "food_bar_id", referencedColumnName = "id")
    private FoodBar foodBar;

}
