package demo;
import java.util.ResourceBundle;

public class main {
	
	public static void main(String a[]) {
	
	Iworker w =factory.getObject();
	manager m =new manager(w);
	
	
	m.mworker();
	
	
//	Iworker w1 =new lazyworker();
//	manager m1 =new manager(w1);
//	
//	
//	m1.mworker();
	
	}
	

}
