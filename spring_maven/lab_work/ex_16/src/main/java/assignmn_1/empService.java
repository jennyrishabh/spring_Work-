package assignmn_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("data")
public class empService {
	
	List<emp> myAccounts;
	
	
//	With all the Add,Update and Delete Employee record. 
//	Also create the metod getEmployeewithId, throwing an exception if the ID is not found. 
	

	public List<emp> add() {
		
		myAccounts = new ArrayList<emp>();
		
		// create sample accounts
		emp temp1 = new emp(1,"John", "Silver","js@dfv.com");
		emp temp2 = new emp(2,"Madhu", "Platinum","mp@dfv.com");
		emp temp3 = new emp(3,"Luca", "Gold","lg@dfv.com");
		
		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		
		return myAccounts;		
	}
	
	
	public void update(int id,emp acc) {
		myAccounts.set(id, acc);
		
	}
	
	
	public void delete(int id) {
		System.out.println("deleted the elemt :"+myAccounts.remove(id));
		
	}
	
	
	public int getempid(int id) {
		
		if(id>=0 && id<myAccounts.size()) {
			//System.out.println("in here..");
		emp temp=myAccounts.get(id);
		}
		else{ throw new IndexOutOfBoundsException();}

		return 1;
	}
	

}
