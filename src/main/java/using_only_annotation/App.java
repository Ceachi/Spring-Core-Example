package using_only_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String args[]) {
		
		
		// creating the context
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		// AppConfig o sa imi dea mie bean-urile
		
		Samsung s7 = (Samsung) factory.getBean(Samsung.class);// asking facotory to give you that object
		s7.config();
	}
}
