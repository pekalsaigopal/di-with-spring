package in.psg.diwithoutspring.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
   @Override
   public String sayGreeting() {
      return "Hello From: PropertyInjectedGreetingService";
   }
}
