package com.jsp.comparator;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		return Double.compare(x.getSalary(), y.getSalary());
	}

}
