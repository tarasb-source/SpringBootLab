package tarasb.springframework.springfsintro.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarasb.springframework.springfsintro.entities.Greeting;
import tarasb.springframework.springfsintro.model.GreetingDto;
import tarasb.springframework.springfsintro.repositories.GreetingRepository;

@Service
public class GreetingServiceImpl implements GreetingService {

  private GreetingRepository greetingRepository;

  public GreetingServiceImpl(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public GreetingDto getGreeting() {
    List<Greeting> list = greetingRepository.findAll();

    if (list.isEmpty()) {
      return new GreetingDto("not found");
    }

    Greeting greeting = list.getFirst();
    return new GreetingDto(greeting.getId(), greeting.getGreeting());
  }
}
