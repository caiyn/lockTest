package test.component;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("test")
public class TestService {

	public void hello(){
		System.out.println("this is testDao from service");	}
}
