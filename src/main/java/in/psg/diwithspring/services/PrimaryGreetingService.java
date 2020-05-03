package in.psg.diwithspring.services;

import in.psg.diwithspring.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService {

   private GreetingRepository greetingRepository;

   public PrimaryGreetingService(GreetingRepository greetingRepository) {
      this.greetingRepository = greetingRepository;
   }

   @Override
   public String sayGreeting() {
      return greetingRepository.getHindiGreeting();
   }
}
