package in.psg.diwithoutspring.controllers;

import in.psg.diwithoutspring.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
   private final GreetingService greetingService;

   //no autowiring need because implicitly it will happen
   public ConstructorInjectedController(GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String getGreeting(){
      return greetingService.sayGreeting();
   }
}
