package employee.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		Employee A=context.getBean("A",Employee.class);
		
		// call the business method
		A.setEmp_name("Priyansh");
		System.out.println(A.getEmp_name());
		System.out.println(A.calculate_sal());

		
		// close the context
		context.close();
    }
}
