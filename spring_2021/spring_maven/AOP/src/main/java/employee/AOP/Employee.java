package employee.AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("A")
public class Employee {
	
	private Address add;
    private String Emp_name;
    private int age;
    private int workdays;
	public int calculate_sal() {
		return 200000;
	}
	public String getEmp_name() {
		return Emp_name;
	}


	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}


	@Override
	public String toString() {
		return "Employee [Employee_name=" + Emp_name + ", add = " + add + "]";
	}

	public Address getAdd() {
		return add;
	}

	@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getWorkdays() {
		return workdays;
	}


	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}
	
}