package gki.org.onetorulethemall.data.models.foodbar;

import gki.org.onetorulethemall.data.models.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "drinks")
public class Drink extends BaseEntity {


    @Column(name = "name")
    private String name;

    @Column(name = "quantities")
    private Integer quantity;

    @Column(name = "liters")
    private Double liters;

    @ManyToOne
    @JoinColumn(name = "food_bar_id", referencedColumnName = "id")
    private FoodBar foodBar;

}
