package com.jsp.comparator;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Aslam", 3.2);
		Employee e2 = new Employee(102, "Ashq", 3.5);
		Employee e3 = new Employee(103, "Rohan", 3.8);
		Employee e4 = new Employee(104, "Saruk", 3.4);
		
		SortEmployeeBySalary salary = new SortEmployeeBySalary();
		
		TreeMap<Employee, String> Employees = new TreeMap<>(salary); 
		Employees.put(e1, "TCS");
		Employees.put(e2, "Amazon");
		Employees.put(e3, "Capgimni");
		Employees.put(e4, "Mahindra tech");
		
		
		
		for (Map.Entry<Employee, String> entry : Employees.entrySet()) {
			System.out.println(entry.getKey() +" and working at -"+entry.getValue());
		}
		
		
	}

}
