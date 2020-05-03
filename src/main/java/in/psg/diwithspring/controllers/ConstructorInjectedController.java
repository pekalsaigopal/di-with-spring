package in.psg.diwithspring.controllers;

import in.psg.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
   private final GreetingService greetingService;

   //no autowiring need because implicitly it will happen
   public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String getGreeting(){
      return greetingService.sayGreeting();
   }
}
