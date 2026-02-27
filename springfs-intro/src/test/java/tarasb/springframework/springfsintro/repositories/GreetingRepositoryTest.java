package tarasb.springframework.springfsintro.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import tarasb.springframework.springfsintro.entities.Greeting;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
public class GreetingRepositoryTest {

  @Autowired
  GreetingRepository greetingRepository;

  @Test
  public void testCreateGreeting() {
    Greeting greeting = new Greeting("Hello World");
    Greeting savedGreeting = greetingRepository.save(greeting);

    assertThat(savedGreeting).isNotNull();
    assertThat(savedGreeting.getId()).isNotNull();
    assertThat(savedGreeting.getGreeting()).isEqualTo("Hello World");
  }

  @Test
  public void testReadGreeting() {
    Greeting greeting = new Greeting("Hello World");
    Greeting savedGreeting = greetingRepository.save(greeting);

    Optional<Greeting> foundGreeting = greetingRepository.findById(savedGreeting.getId());

    assertThat(foundGreeting).isPresent();
    assertThat(foundGreeting.get().getGreeting()).isEqualTo("Hello World");
  }

  @Test
  public void testUpdateGreeting() {
    Greeting greeting = new Greeting("Hello World");
    Greeting savedGreeting = greetingRepository.save(greeting);

    savedGreeting.setGreeting("Updated Greeting");
    Greeting updatedGreeting = greetingRepository.save(savedGreeting);

    assertThat(updatedGreeting.getGreeting()).isEqualTo("Updated Greeting");
    assertThat(updatedGreeting.getId()).isEqualTo(savedGreeting.getId());
  }

  @Test
  public void testDeleteGreeting() {
    Greeting greeting = new Greeting("Hello World");
    Greeting savedGreeting = greetingRepository.save(greeting);
    Integer greetingId = savedGreeting.getId();

    greetingRepository.delete(savedGreeting);
    Optional<Greeting> deletedGreeting = greetingRepository.findById(greetingId);
    assertThat(deletedGreeting).isEmpty();
  }
}
