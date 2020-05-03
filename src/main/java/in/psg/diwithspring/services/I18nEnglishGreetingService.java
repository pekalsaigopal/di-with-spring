package in.psg.diwithspring.services;

import in.psg.diwithspring.repositories.GreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18nEnglishGreetingService implements GreetingService{

   private GreetingRepository greetingRepository;

   public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
      this.greetingRepository = greetingRepository;
   }

   @Override
   public String sayGreeting() {
      return greetingRepository.getEnglishGreeting();
   }
}
