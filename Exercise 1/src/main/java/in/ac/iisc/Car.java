package in.ac.iisc;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "cars")
public class Car {
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    Manufacturer manufacturer;
    @Column(name = "model_name")
    String model;
    @Column(name = "purchase_date")
    LocalDate dateOfPurchase;
    @Column(name = "horsepower")
    int horsepower;

    Car(Manufacturer manufacturer, String model, LocalDate dateOfPurchase, int horsepower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dateOfPurchase = dateOfPurchase;
        this.horsepower = horsepower;
    }
}
