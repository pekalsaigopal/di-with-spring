package in.psg.diwithoutspring;

import in.psg.diwithoutspring.controllers.ConstructorInjectedController;
import in.psg.diwithoutspring.controllers.MyController;
import in.psg.diwithoutspring.controllers.PropertyInjectedController;
import in.psg.diwithoutspring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiWithoutSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiWithoutSpringApplication.class, args);

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

		//@primary demo
		MyController myController = (MyController) ctx.getBean("myController");
		String greetingFromMyController = myController.getGreeting();
		System.out.println(greetingFromMyController);






	}

}
