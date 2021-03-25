package first;

public class A {
	
	B obj;

	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "A [obj="+obj.hashCode() + obj + "]";
	}
	
	
	//public void setNa(String b) {obj.setN(b);}
	
	A(){System.out.println("in_A_cons");}
	
	
	
}
