package firstIOC;

public class cricketCouch implements Coach {
	
	private iFortune ifortune;
	public cricketCouch(iFortune ifortune) {
		
		this.ifortune=ifortune;
		
	}

	@Override
	public String getDailyWorkout() {
		

		return "hello_from_cricket";
	}
	
	
	public String getDailyFortune() {
		return ifortune.getFortune();
	}
	
	
	
//	public cricketCouch(int X) {
//		
//		System.out.println("in new const");
//		
//	}

}
