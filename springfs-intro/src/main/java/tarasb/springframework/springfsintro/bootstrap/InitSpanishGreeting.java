package tarasb.springframework.springfsintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import tarasb.springframework.springfsintro.entities.Greeting;
import tarasb.springframework.springfsintro.repositories.GreetingRepository;

@Component
@Profile("spanish")
public class InitSpanishGreeting implements CommandLineRunner {
  private final GreetingRepository greetingRepository;

  public InitSpanishGreeting(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public void run(String... args) {
    greetingRepository.save(new Greeting("Hola Mundo"));
  }
}
