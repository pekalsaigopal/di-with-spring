package in.psg.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HI","default"})
@Service("i18nService")
public class I18nHindiGreetingService implements GreetingService{
   @Override
   public String sayGreeting() {
      return "Namaskar - HI";
   }
}
