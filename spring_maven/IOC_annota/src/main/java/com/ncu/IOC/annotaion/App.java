package com.ncu.IOC.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       
    			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
						
		
		//another method of loading :
		 //XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("spring.xml")); ​
				// retrieve bean from spring container
				
				
				Couch baseball = (Couch)context.getBean("base1");
		 
			//Coach baseball = (Coach)factory.getBean("base", Coach.class);

				
				// call methods on the bean
				System.out.println(baseball.getDailyWorkout());
				System.out.println(baseball.getDailyFortune());
				
				System.out.println("using config.properties file in resouce ...."+baseball.toString());
				
				Couch tcouch = (Couch)context.getBean("tcouch");
					System.out.println(tcouch.getDailyWorkout());
					System.out.println(tcouch.getDailyFortune());
    	
    	
    	
    	
    }
}
