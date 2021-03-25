package demo;

import java.util.ResourceBundle;

public class factory1 {
	
	private static ResourceBundle rb =ResourceBundle.getBundle("config");
	
	static Iconsumer getObject() {
		
		
		
		Object o =null;
		String classname=rb.getString("class-name");
		try {o=Class.forName(classname).getDeclaredConstructor().newInstance();}
		catch(Exception e ) {}
		
		return (Iconsumer)o;
		
	}
		
}