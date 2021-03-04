package first;

public class B {
	
	
	C obj;
	
	B(){System.out.println("in_B_cons");}
	
	public C getObj() {
		return obj;
	}
	public void setObj(C obj) {
		this.obj = obj;
	}
	
	//public void setN(String b) {obj.name=b;}
	
	
	
	@Override
	public String toString() {
		return "B [obj="+obj.hashCode() + obj + "]";
	}
	

}
