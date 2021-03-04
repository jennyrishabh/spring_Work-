package AOP_first.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(config.class);
		
		// get the bean from spring container
		addDetail theAccountDao=context.getBean("add",addDetail.class);
		
		// call the business method
		theAccountDao.add();

	
		System.out.println("\nlet's call it again!\n");
		
		// call the business method again
		theAccountDao.add();
				
		// close the context
		context.close();
    	
    }
}
