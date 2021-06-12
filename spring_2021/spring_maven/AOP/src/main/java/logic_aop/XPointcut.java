package logic_aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class XPointcut {
	
	@Pointcut("execution(* logic())")
	private void forlogic() {}
	
	@Around("forlogic()")
	public Object aroundaspect(ProceedingJoinPoint pt)throws Throwable {
		 Object result;
		 long begin = System.currentTimeMillis();
		System.out.println("Around advice");
//		 print out which method we are advising on 
		System.out.println("****logAroundAllMethods() : " 
+ pt.getSignature().getName() + ": Before Method Execution");
        try {
           result=pt.proceed();
//           System.out.println("\n=====>>> result is: " + result);
        } finally {
        	long end = System.currentTimeMillis();
        	long duration = end - begin;
    		System.out.println("\n=====> Duration: " 
        	+ duration / 1000.0 + " seconds");
        }
        System.out.println("****LoggingAspect.logAroundAllMethods() :"
        + pt.getSignature().getName() +" : After Method Execution");
		
		return result;
		
	}
	
	
}
