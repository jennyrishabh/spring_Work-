package emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class mainapp {
	
public static void main(String a[]) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(configapp.class);
		
		couch theCoach = context.getBean("ccouch", ccouch.class);
		
		
		System.out.println(theCoach. getdailyworkout());
		
		
		System.out.println(theCoach. getfortune());
		
		
		
		
		
		
		
		
		
		
	}

}
