package first;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//System.out.println("hello_from_main()1");
	
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("hello_from_main()2");
//		
		A obj1=(A)context.getBean("obj1");
		
		//obj1.setNa("ravi_kumar");
		
		A obj2=(A)context.getBean("obj1");
		
		//obj2.setNa("pulkit_bhatia");
		
		A obj3=(A)context.getBean("obj1");
		
		//obj3.setNa("aviral_jain");
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		
		
	
		

	}

}
