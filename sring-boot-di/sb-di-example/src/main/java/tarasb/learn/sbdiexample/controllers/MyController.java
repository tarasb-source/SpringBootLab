package tarasb.learn.sbdiexample.controllers;

import org.springframework.stereotype.Controller;
import tarasb.learn.sbdiexample.services.GreetingService;

@Controller
public class MyController {

  private final GreetingService greetingService;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
