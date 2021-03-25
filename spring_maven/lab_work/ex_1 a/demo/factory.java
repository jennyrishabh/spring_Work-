package demo;

import java.util.ResourceBundle;

public class factory {
	
	private static ResourceBundle rb =ResourceBundle.getBundle("config");
	
	static Iworker getObject() {
		
		
		
		Object o =null;
		String classname=rb.getString("class-name");
		try {o=Class.forName(classname).getDeclaredConstructor().newInstance();}
		catch(Exception e ) {}
		
		return (Iworker)o;
		
	}
		
}