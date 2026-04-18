package tarasb.learn.sbdiexample.services;

import tarasb.learn.sbdiexample.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

  private final EnglishGreetingRepository englishGreetingRepository;

  public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
    this.englishGreetingRepository = englishGreetingRepository;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - EN";
  }
}
