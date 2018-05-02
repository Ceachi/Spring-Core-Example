package using_only_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // responsabil sa imi dea clasele
@ComponentScan(basePackages = "using_only_annotation") // specify where to find all your classes with @Component annotation
public class AppConfig {
	// now if you have ComponentScan don;t need to make the @Bean methods	
}
