package gki.org.onetorulethemall.data.models.foodbar;

import gki.org.onetorulethemall.data.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "food_bar")
public class FoodBar extends BaseEntity {

    @OneToMany(mappedBy = "foodBar")
    private List<Food> foods;

    @OneToMany(mappedBy = "foodBar")
    private List<Drink> drinks;

}
