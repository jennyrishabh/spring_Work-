

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("constructorSpring.xml");
//		
		Customer cust=(Customer)context.getBean("customer");
		System.out.println(cust.toString());

	}

}
