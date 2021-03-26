package java_config_1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ccouch implements couch {

	
	private fortune fort;
	
	
	public ccouch(fortune fort) {
		//super();
		this.fort = fort;
	}
	
	
	public ccouch() {
		System.out.println("in_default_one(ccouch class..)");
	}





	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "in ccouch class";
	}


	
	

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		
		return fort.getfortune();
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("in_start_method_start()");
	}
	
	@PreDestroy
	public void destroymy() {
		System.out.println("in_destroy_method_destroy()");
	}
	
	
	
	
	

}
