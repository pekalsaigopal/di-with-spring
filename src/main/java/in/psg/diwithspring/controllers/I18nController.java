package in.psg.diwithspring.controllers;

import in.psg.diwithspring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
   private final GreetingService greetingService;

   public I18nController(@Qualifier("primaryGreetingService") GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String sayHello(){
      return greetingService.sayGreeting();
   }
}
