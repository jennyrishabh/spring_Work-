package demo;

public class manager {
	
	Iworker w;
	public manager(Iworker w){
		
		this.w=w;
		
	}
	
	public void mworker() {
		
		this.w.work();
		
	}

}
