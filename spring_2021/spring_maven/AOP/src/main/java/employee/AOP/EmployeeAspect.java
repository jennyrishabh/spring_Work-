package employee.AOP;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Around;
//import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	@Before("execution(public String getEmp_name())")
	public void Advice1() {
		
	System.out.println("Before Getname Advice Method");
	}
	@After("execution(public void setEmp_name(String))")
	public void Advice2() {
		
	System.out.println("After Setname Advice Method");
	}
	@Around("execution(public int calculate_sal())")
	public int Advice3() {
		
		System.out.println("Around calculate_sal Advice Method");
		return 20000;
		}
	
}
