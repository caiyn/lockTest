package test.lockTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.lockTest.bs.LockTestBS;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		LockTestBS lt = (LockTestBS)context.getBean("testBS");
		//插入数据  这个是插入数据的  要先执行这个 数据库里才有数据 现在
		for(int i=0;i<10000;i++)
			lt.initDate();
	}

}
