package emp;

import java_config_1.fortune;

public class lazyworker implements iWorker {

	@Override
	public String getwork() {
		// TODO Auto-generated method stub
		return "in lazywoker class";
	}
	
	private fortune fort;
	
	
	public lazyworker(fortune fort) {
		//super();
		this.fort = fort;
	}


	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return fort.getfortune();
	}
	

}
