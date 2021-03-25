package com.ncu.byNameDemo;

import java.util.List;

public class Driver {
	private String Driver_name;
private List<License> details;

@Override
public String toString() {
	return "Driver [Driver_name=" + Driver_name + ", details=" + details + "]";
}

public List<License> getDetails9() {
	return details;
}

public void setDetails9(List<License> details) {
	this.details = details;
}

public String getDriver_name() {
	return Driver_name;
}

public void setDriver_name(String driver_name) {
	Driver_name = driver_name;
}


}
