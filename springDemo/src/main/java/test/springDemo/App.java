package test.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * javaConfig test
 * @author 蔡亚宁
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Ihello hello = (Ihello)context.getBean("helloBean");
		hello.sayHello();
	}
}
