package using_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // responsabil sa imi dea clasele
public class AppConfig {
	
	
/*
 * Daca la AppConfig ai doar anotarea @Configuration
 * iar celelalte clase Samsung, MobileProcessor nu au anotarea
 * @Component trebuie sa definesti urmatoarele metode ca sa mearga.
 * 
 */
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}
	
}
