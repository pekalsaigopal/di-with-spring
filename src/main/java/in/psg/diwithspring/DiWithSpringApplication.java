package in.psg.diwithspring;

import in.psg.diwithspring.controllers.ConstructorInjectedController;
import in.psg.diwithspring.controllers.PropertyInjectedController;
import in.psg.diwithspring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiWithSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiWithSpringApplication.class, args);

		//property injection
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		String greetingFromProperty=propertyInjectedController.getGreeting();
		System.out.println(greetingFromProperty);

		//setter injection
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		String greetingFromSetter=setterInjectedController.getGreeting();
		System.out.println(greetingFromSetter);

		//constructor injection
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		String greetingFromConstructor = constructorInjectedController.getGreeting();
		System.out.println(greetingFromConstructor);





	}

}
