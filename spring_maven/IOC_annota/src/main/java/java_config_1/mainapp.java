package java_config_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainapp {
	public static void main(String a[]) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(configapp.class);
		
		couch theCoach = context.getBean("ccouch", couch.class);
		
		
		System.out.println(theCoach. getdailyworkout());
		
		
		System.out.println(theCoach. getfortune());
		
		couch theCoach_1 = context.getBean("ccouch", couch.class);
		System.out.println("two diff. class instance is given:\n"+theCoach.hashCode()+" "+theCoach_1.hashCode());
		
		ccouch theCoach123 = context.getBean("ccouch1", ccouch.class);
		
		
		
		((AnnotationConfigApplicationContext)context).close();
		
		
		
		
	}

}
