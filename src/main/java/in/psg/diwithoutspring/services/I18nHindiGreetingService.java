package in.psg.diwithoutspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HI")
@Service("i18nService")
public class I18nHindiGreetingService implements GreetingService{
   @Override
   public String sayGreeting() {
      return "Namaskar - HI";
   }
}
