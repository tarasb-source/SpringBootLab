package tarasb.springframework.springfsintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import tarasb.springframework.springfsintro.entities.Greeting;
import tarasb.springframework.springfsintro.model.GreetingDto;
import tarasb.springframework.springfsintro.repositories.GreetingRepository;

@Component
@Profile("default")
public class InitEnglishGreeting implements CommandLineRunner {
  private final GreetingRepository greetingRepository;

  public InitEnglishGreeting(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Greeting greeting = new Greeting("Hello World");
    greetingRepository.save(greeting);
  }
}
