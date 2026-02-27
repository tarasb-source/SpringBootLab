package tarasb.springframework.springfsintro.entities;

import jakarta.persistence.*;

@Entity
public class Greeting {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String greeting;

  public Greeting() {

  }

  public Greeting(String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return this.greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
