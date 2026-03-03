package tarasb.springframework.petclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class NamedEntity extends BaseEntity {
  @Column(name = "name")
  @NotEmpty
  @Setter @Getter
  private String name;

  @Override
  public String toString() {
    return this.name;
  }
}
