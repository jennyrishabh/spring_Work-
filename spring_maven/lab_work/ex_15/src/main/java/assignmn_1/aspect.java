package assignmn_1;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspect {
	//Logger logger = Logger.getLogger(LoggerAspect.class);
//	
//	long starttime,endtime;
	//pointcut declaration for the method print with predicate implementation
//	@Pointcut("execution(* p*())")
//	public void myPointCut() {}
//	
//	
//	//apply the advice before aspect on the print method
//	@Before("myPointCut()")
//	public void start(JoinPoint jp) {
//		logger.debug("Going to start "+jp.getSignature());
//		System.out.println("Start Call "+jp.getSignature());
//		System.out.println("Method Name: "+jp.getStaticPart().getSignature().getName());
//		starttime=System.currentTimeMillis();
//		logger.debug("starttime: "+starttime);
//	}
//	//apply the advice after aspect on the print method
//	@After("myPointCut()")
//	public void end(JoinPoint jp) {
//		logger.debug("Going to endtime "+jp.getSignature());
//		
//		endtime=System.currentTimeMillis();
//		System.out.println("Total Time Taken "+(endtime-starttime)+"ms");
//	}
	
	
	
	
	
//	@AfterReturning(pointcut = "myPointCut()" ,returning = "result")
//	public void returnAdvice(String result) {
//		System.out.println("After Return Result is "+result);
//	}
	
	
	@Around("execution(* add(..))")
	public Object aroundAdvice(ProceedingJoinPoint pt)throws Throwable {
		
		//logger.debug("Going to start "+pt.getSignature());
		
		Object result=null;
		long start=0,end=0;
		System.out.println("in here before execution of the  emthod in around..");
		start=System.currentTimeMillis();
		try {
			result=pt.proceed();
			
		}catch(Exception e) {}
		
		
		System.out.println("ending the method that were caled in around advce");
		end=System.currentTimeMillis();
		System.out.println("time is : "+((double)(end-start)/(double)1000));
		
		return result;
		
	}
	
	
	@AfterThrowing(pointcut="execution(* assignmn_1.empService.*(*))" , throwing="throwex")
	public void errormsg(JoinPoint jp , Throwable throwex) {
		
		//logger.debug("Going to start "+throwex);
		 System.out.println("Method Signature: "  + jp.getSignature());  
		   System.out.println("Exception: "+throwex);  
		   
		   System.out.println("Exception handled... :)");  
		
	}
	
	
}
