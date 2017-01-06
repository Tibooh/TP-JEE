package fr.eservices.sample2.appl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import fr.eservices.sample2.appl.Application;
import fr.eservices.sample2.api.Greeter;
import fr.eservices.sample2.api.Printer;
import fr.eservices.sample2.api.Welcome;

//TODO Add annotation if required.
@Configuration
@ComponentScan(value="fr.eservices.sample2.impl")
@Component
public class Application {
	
	@Autowired
	@Qualifier("console")
	Welcome welcome;
	
	@Autowired
	@Qualifier("french")
	Greeter greeter;
	
	@Autowired
	@Qualifier("console")
	Printer printer;
	

	public Application() {
	}
	
	public void run() {
		String name = welcome.askName();
		String response = greeter.hello(name);
		printer.print( response );
	}

	public void setWelcome(Welcome welcome) {
		this.welcome = welcome;
	}

	public void setGreeter(Greeter greeter) {
		this.greeter = greeter;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public static void main(String[] args) {
		// TODO Create a spring context
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(Application.class);
		// TODO Get Application From context
		Application app = context.getBean(Application.class);
		// TODO Call run
		app.run();

	}
}
