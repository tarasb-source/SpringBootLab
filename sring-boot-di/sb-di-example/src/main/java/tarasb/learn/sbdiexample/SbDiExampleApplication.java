package tarasb.learn.sbdiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tarasb.learn.sbdiexample.controllers.*;

@SpringBootApplication
public class SbDiExampleApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SbDiExampleApplication.class, args);

//    MyController myController = (MyController) ctx.getBean("myController");
//
//    System.out.println(myController.sayHello());
//
//    System.out.println("------ Property");
//    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//    System.out.println(propertyInjectedController.getGreeting());
//
//    System.out.println("--------- Setter");
//    SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//    System.out.println(setterInjectedController.getGreeting());
//
//    System.out.println("-------- Constructor" );
//    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//    System.out.println(constructorInjectedController.getGreeting());
    I18nController i18nController = (I18nController) ctx.getBean("i18nController");
    System.out.println(i18nController.sayHello());
  }
}
