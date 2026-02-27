package tarasb.springframework.springfsintro.bootstrap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import tarasb.springframework.springfsintro.entities.Greeting;
import tarasb.springframework.springfsintro.repositories.GreetingRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("spanish")
public class InitSpanishGreetingTest {

  @Autowired
  private GreetingRepository greetingRepository;

  @Test
  public void testSpanishGreetingInitialized() {
    List<Greeting> greetings = greetingRepository.findAll();
    assertFalse(greetings.isEmpty());

    boolean greetingInitialized = greetings.stream()
        .anyMatch((greeting) -> greeting.getGreeting().equals("Hola Mundo"));
    assertTrue(greetingInitialized, "Spanish greeting 'Hola Mundo' should be found in the repository");
  }
}
