package in.ac.iisc;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {
    @Column(name = "name")
    String name;
    @OneToMany
    @JoinColumn(name = "car_id")
    List<Car> cars;

    Owner(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    void addCar(Car car) {
        cars.add(car);
    }
}
