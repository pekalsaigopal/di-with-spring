package in.psg.diwithspring.services;

import in.psg.diwithspring.repositories.GreetingRepository;

public class GreetingServiceFactory {

   private GreetingRepository greetingRepository;

   public GreetingServiceFactory(GreetingRepository greetingRepository) {
      this.greetingRepository = greetingRepository;
   }

   public GreetingService createGreetingService(String lang) {

      switch (lang){
         case "en":
            return new I18nEnglishGreetingService(greetingRepository);
         case "hi":
            return new I18nHindiGreetingService(greetingRepository);
         default:
            return new PrimaryGreetingService(greetingRepository);
      }

   }
}
