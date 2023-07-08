package in.ac.iisc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {
    @Column(name = "name")
    String name;
    @Column(name = "headquarters")
    String headquarters;

    Manufacturer(String name, String headquarters) {
        this.name = name;
        this.headquarters = headquarters;
    }
}
