package bean_life_cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy
public class b {
	
	
	
c obj;
	
	b(){System.out.println("in_B_cons");}
	
	public c getObj() {
		return obj;
	}
	@Autowired
	public void setObj(c obj) {
		this.obj = obj;
	}
	
	//public void setN(String b) {obj.name=b;}
	
	
	
	@Override
	public String toString() {
		return "B [obj="+obj.hashCode() + obj + "]";
	}
	

}
