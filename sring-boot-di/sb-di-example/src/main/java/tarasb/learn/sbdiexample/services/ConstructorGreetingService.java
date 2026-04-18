package tarasb.learn.sbdiexample.services;

import org.springframework.stereotype.Service;

public class ConstructorGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - Constructor";
  }
}
