package tarasb.learn.sbdiexample.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import tarasb.learn.sbdiexample.services.GreetingService;

@Controller
public class I18nController {

  GreetingService greetingService;

  public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
