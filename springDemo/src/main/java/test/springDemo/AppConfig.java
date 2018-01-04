package test.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="helloBean")
	public Hello hello(){
		return new Hello();
	}
}
