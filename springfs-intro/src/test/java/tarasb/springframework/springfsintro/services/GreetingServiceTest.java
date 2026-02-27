package tarasb.springframework.springfsintro.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tarasb.springframework.springfsintro.entities.Greeting;
import tarasb.springframework.springfsintro.model.GreetingDto;
import tarasb.springframework.springfsintro.repositories.GreetingRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GreetingServiceTest {

  @Mock
  GreetingRepository greetingRepository;

  GreetingService greetingService;

  @BeforeEach
  void setUp() {
    greetingService = new GreetingServiceImpl(greetingRepository);
  }

  @Test
  void testGetGreeting_WhenEntitiesExist_ReturnsFirstEntity() {
    Greeting greeting1 = new Greeting("Greeting 1");
    greeting1.setId(1);
    Greeting greeting2 = new Greeting("Greeting 2");
    greeting2.setId(2);

    List<Greeting> greetings = Arrays.asList(greeting1, greeting2);

    when(greetingRepository.findAll()).thenReturn(greetings);

    GreetingDto foundGreeting = greetingService.getGreeting();

    assertEquals(1, foundGreeting.getId());
    assertEquals("Greeting 1", foundGreeting.getGreeting());
  }

  @Test
  void testGetGreeting_WhenNoEntitiesExist_ReturnsNotFound() {
    List<Greeting> greetings = Arrays.asList();

    when(greetingRepository.findAll()).thenReturn(greetings);

    GreetingDto foundGreeting = greetingService.getGreeting();

    assertEquals(null, foundGreeting.getId());
    assertEquals("not found", foundGreeting.getGreeting());
  }
}
