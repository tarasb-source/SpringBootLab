package tarasb.springframework.petclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "specialty")
public class Specialty extends NamedEntity {

}
