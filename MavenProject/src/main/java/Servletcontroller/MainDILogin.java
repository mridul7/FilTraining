package Servletcontroller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDILogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("mybeans.xml");
		LoginCheckerInterface loginService=applicationContext.getBean("loginChecker",LoginCheckerInterface.class);
		System.out.println(loginService);
		LoginCheckerInterface loginService2=applicationContext.getBean("loginChecker2",LoginCheckerInterface.class);
		System.out.println(loginService2);
		LoginCheckerInterface loginService3=applicationContext.getBean("loginChecker",LoginCheckerInterface.class);
		System.out.println(loginService3);
     Outer outer= applicationContext.getBean("Outer",Outer.class);
     Inner inner=applicationContext.getBean("Inner",Inner.class);
     System.out.println(outer.getOuterValue());
     System.out.println(inner.getValue());
     

	}

}
