package advice_aop;

import org.springframework.stereotype.Component;

@Component("account")
public class Account {

	String name;
	String level;
	
	public Account() {
		
	}
	
	public Account(String name, String level) {
		
		this.name = name;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + "]";
	}
	
	
}
