package first;

public class C {
	
	@Override
	public String toString() {
		return "C [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	C(){System.out.println("in_C_cons");}

	String name;
	int id;
	int age;
	
	

	public C(String name, int id, int age) {
		
		this.name = name;
		this.id = id;
		this.age = age;
	}
	

}
