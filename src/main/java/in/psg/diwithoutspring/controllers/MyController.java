package in.psg.diwithoutspring.controllers;

import in.psg.diwithoutspring.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
   private final GreetingService greetingService;

   public MyController(GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String getGreeting(){
      return greetingService.sayGreeting();
   }
}
