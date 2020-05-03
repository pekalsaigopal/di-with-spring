package in.psg.diwithspring.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

   @Override
   public String getEnglishGreeting() {
      return "Hello From - English Greeting Service";
   }

   @Override
   public String getHindiGreeting() {
      return "Namskar From - Hindi Greeting Service";
   }
}
