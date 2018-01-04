//package test.component;
//
//import org.springframework.stereotype.Component;
//
//import com.opensymphony.xwork2.interceptor.annotations.Before;
//
//@Component("annotationTest")
//@Aspect
//public class BeforeMethod{
//
//	@Pointcut("execution(* *.hello(..))")  
//    private void aa() {  
//    }//切入点签名 
//	/** 
//     * 前置通知 
//     */  
//    @Before("aa()")  
//    public void beforeMethod() {  
//        System.out.println("before method");  
//    }
//}
