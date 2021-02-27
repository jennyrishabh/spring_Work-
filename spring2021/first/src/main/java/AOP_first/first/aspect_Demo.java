package AOP_first.first;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspect_Demo {

	
	@Before("execution(public void add())")
	public void beforeMethod() {
		System.out.println("this_is_called_before_callign_the_addin_addDeatlclass_nethod()...... ");
		
	}
	
	
	
	@After("execution(public void add())")
	public void afterMethod() {
		System.out.println("this_is_called_after_callign_the_addin_addDeatlclass_nethod()...... ");
		
	}
	
	
	
}
