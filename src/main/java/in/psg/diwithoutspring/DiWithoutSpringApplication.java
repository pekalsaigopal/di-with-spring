package in.psg.diwithoutspring;

import in.psg.diwithoutspring.controllers.PropertyInjectedController;
import in.psg.diwithoutspring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiWithoutSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiWithoutSpringApplication.class, args);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		String greetingFromProperty=propertyInjectedController.getGreeting();
		System.out.println(greetingFromProperty);

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		String greetingFromSetter=setterInjectedController.getGreeting();
		System.out.println(greetingFromSetter);




	}

}
