package assignmn_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class main {
	
	public static void main(String a[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		// get the bean from spring container
		empService temp1=context.getBean("data",empService.class);
		
		
		System.out.println("returned from add() method :"+temp1.add());
		
		try {
		temp1.getempid(10);
		}
		catch(Exception e) {}
		
		
		
		System.out.println("\n\nend of main..()");
		
		
		context.close();
		
		
	}

}
