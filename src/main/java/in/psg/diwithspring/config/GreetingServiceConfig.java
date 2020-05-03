package in.psg.diwithspring.config;

import in.psg.diwithspring.repositories.GreetingRepository;
import in.psg.diwithspring.services.GreetingService;
import in.psg.diwithspring.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

   @Bean
   GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
      return new GreetingServiceFactory(greetingRepository);
   }


   @Bean
   @Primary
   GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
      return greetingServiceFactory.createGreetingService("en");
   }

   @Bean
   @Profile("hi")
   GreetingService i18HindiGreetingService(GreetingServiceFactory greetingServiceFactory){
      return greetingServiceFactory.createGreetingService("hi");
   }

   @Bean
   @Profile("en")
   GreetingService i18EnglishGreetingService(GreetingServiceFactory greetingServiceFactory){
      return greetingServiceFactory.createGreetingService("en");
   }
}
