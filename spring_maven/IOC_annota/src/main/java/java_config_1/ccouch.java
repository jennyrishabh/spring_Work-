package java_config_1;

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
	
	
	
	
	

}
