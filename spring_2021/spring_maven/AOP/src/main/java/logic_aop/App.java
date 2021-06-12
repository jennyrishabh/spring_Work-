package logic_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// read spring config java class
    			AnnotationConfigApplicationContext context =
    					new AnnotationConfigApplicationContext(DemoConfig.class);
    			
    			// get the bean from spring container
    			X theAccountDao=context.getBean("logic",X.class);
    			
    			// call the business method
    			theAccountDao.logic();

    					
    			// close the context
    			context.close();
    }
}