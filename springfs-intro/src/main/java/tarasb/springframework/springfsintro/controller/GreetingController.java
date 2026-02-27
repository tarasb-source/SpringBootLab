package tarasb.springframework.springfsintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tarasb.springframework.springfsintro.model.GreetingDto;
import tarasb.springframework.springfsintro.services.GreetingService;

@RestController
public class GreetingController {
  final GreetingService greetingService;

  public GreetingController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @GetMapping("api/v1/greeting")
  public GreetingDto getGreeting() {
    return greetingService.getGreeting();
  }
}
