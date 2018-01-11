package test.lockTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.lockTest.bs.LockTestBS;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		final LockTestBS lt = (LockTestBS)context.getBean("testBS");
		
		//更新操作线程
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				lt.updateAge();
			}
			
		});
//		
		//删除操作线程 
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				lt.deleteAge();
			}
			
		});
//		
		//启动线程
		t1.start();
		t2.start();
	}

}
